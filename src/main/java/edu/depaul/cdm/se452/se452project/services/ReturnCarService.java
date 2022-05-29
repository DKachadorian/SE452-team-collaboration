package edu.depaul.cdm.se452.se452project.services;

import edu.depaul.cdm.se452.se452project.dto.ReservationSearch;
import edu.depaul.cdm.se452.se452project.dto.ReturnCarForm;
import edu.depaul.cdm.se452.se452project.entities.Car;
import edu.depaul.cdm.se452.se452project.entities.Customer;
import edu.depaul.cdm.se452.se452project.repositories.CustomerRepository;
import edu.depaul.cdm.se452.se452project.entities.Reservation;
import edu.depaul.cdm.se452.se452project.repositories.ReservationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

@Service
public class ReturnCarService {
    CustomerRepository customerRepository;
    ReservationRepository reservationRepository;

    Logger logger = LoggerFactory.getLogger(ReturnCarService.class);

    @Autowired
    ReturnCarService(CustomerRepository customerRepository, ReservationRepository reservationRepository){
        this.customerRepository = customerRepository; this.reservationRepository = reservationRepository;
    }

    public boolean validateReturn(ReturnCarForm returnCarForm){
        double fees = CalculateFees(returnCarForm);

        ResetCar(returnCarForm);
        return false;
    }

    public double CalculateFees(ReturnCarForm rcf){
        // late fee = $500
        double fee = 0;
        if(rcf.getLateReturn()){ fee += 500;}

        // gas fee = up to $50
        fee += (50 - (((rcf.getTank())/100)*50));

        // missing extra(s) fee - sunroof is 200, carseat is 70
        if(!rcf.getSunRoof()){fee += 200;}
        if(!rcf.getCarSeat()){fee += 70;}

        // interior damage(s) fee
        if(rcf.getInteriorDamageBack()){fee += 100;}
        if(rcf.getInteriorDamageDriver()){fee += 100;}
        if(rcf.getInteriorDamageDriver()){fee += 100;}
        if(rcf.getInteriorDamagePassenger()){fee += 100;}

        // exterior damage(s) fee
        if(rcf.getExteriorDamageBack()){fee += 100;}
        if(rcf.getExteriorDamageFront()){fee += 100;}
        if(rcf.getExteriorDamageLeft()){fee += 100;}
        if(rcf.getExteriorDamageRight()){fee += 100;}

        // mileage fee (+50 per 100m)
        ////--- ???? nothing done for now

        // car rank (will determine fee per day)
        double daily = 0;

        Reservation r = Optional.of(reservationRepository.findReservationById(rcf.getRentalId()))
                .orElseThrow(RuntimeException::new);

        // REMOVE car prive element from cars? or draw from cars instead????
        Car car = r.getCar();
        switch(car.getCarClass()){
            case "LUXURY":
                daily = 485;
                break;
            case"ECONOMY":
                daily = 95;
                break;
            default:
                daily = 295;
                break;
        }

        // rental period (daily fee * days is base rental fee)
        long days = r.getDaysReserved(); // in case parse fails
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
            Date start = sdf.parse(r.getStartDate().toString());
            Date end = sdf.parse(r.getEndDate().toString());

            long diff = end.getTime() - start.getTime();

            TimeUnit time = TimeUnit.DAYS;
            days = time.convert(diff, TimeUnit.MILLISECONDS);
        }catch(Exception e){System.out.println("Parse issue");}

        fee += (daily*days);

        return fee;

    }

    //METHOD: Set car back to available
    public void ResetCar(ReturnCarForm rcf){
        if(rcf.getExteriorDamageRight()|| rcf.getExteriorDamageBack()||
                rcf.getExteriorDamageFront()|| rcf.getExteriorDamageLeft()||
                rcf.getInteriorDamageBack()||rcf.getInteriorDamageDriver()||
                rcf.getInteriorDamagePassenger()|| rcf.getInteriorDamageTrunk()||
                !rcf.getSunRoof()){
            // In real life, we would send car for repairs, instead of setting available here, due to damages
            logger.info("CAR SHOULD BE SENT FOR REPAIRS... CAR HAS BEEN REPAIRED...");
        }
        long reservation = rcf.getRentalId();
        try{
            Reservation res = fetchReservation(reservation); // get reservation
            Car c = res.getCar(); // pull car
            c.setCarAvailable(true); // reset availability
            return;
        }
        catch(Exception e){
            logger.error("Unable to process reservation and reset car");
            return;}

    }

    public Reservation fetchReservation(long id) {
        try {
            return Optional.of(reservationRepository.findReservationById(id))
                    .orElseThrow(RuntimeException::new);
        } catch (RuntimeException e) {
            logger.error("Reservation not found in DB: " + id );
            return null;
        }
    }

    //METHOD: Get customer and car info to set form up


}
