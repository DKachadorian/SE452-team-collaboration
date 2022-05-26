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

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileSystemNotFoundException;
import java.util.Optional;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

@Service
public class ReturnCarService {
    CustomerRepository customerRepository;
    ReservationRepository reservationRepository;
    ReservationSearchService reservationSearchService;

    Logger logger = LoggerFactory.getLogger(ReturnCarService.class);

    @Autowired
    ReturnCarService(CustomerRepository customerRepository, ReservationRepository reservationRepository, ReservationSearchService reservationSearchService){
        this.customerRepository = customerRepository; this.reservationRepository = reservationRepository; this.reservationSearchService = reservationSearchService;
    }

    public void setupReturn(ReturnCarForm rcf, ReservationSearch rs){
        // Current Date
        rcf.setDateCurr(getCurrDateStr());
        // Rental ID
        rcf.setRentalId(rs.getId());
        // Determine which add-ons

        rcf.setReservation(reservationSearchService.fetchReservation(rcf.getRentalId()));
        Car c = rcf.getReservation().getCar();
        try{
            ScriptEngine ee = new ScriptEngineManager().getEngineByName("Javascript");
            ee.eval(new FileReader("./src/main/resources/static/script.js"));
            Invocable invocable = (Invocable)ee;
            if(!c.getBabySeat()){invocable.invokeFunction("hideCarSeat");}
            if(!c.getCarSunroof()){invocable.invokeFunction("hideSunRoof");}
        }
        catch(Exception e)
        {
            System.out.println("BEEP BOOP NO FILE");
        }
        // Init values
        rcf.setTotalFee(0.0);
        rcf.setRentalFee(0.0);
        rcf.setGasFee(0.0);
        rcf.setExtrasFee(0.0);
        rcf.setLateFee(0.0);
        rcf.setDamageFee(0.0);
        rcf.setSunRoof(false);
        rcf.setCarSeat(false);
        rcf.setExteriorDamageBack(false);
        rcf.setExteriorDamageFront(false);
        rcf.setExteriorDamageRight(false);
        rcf.setExteriorDamageLeft(false);
        rcf.setInteriorDamageBack(false);
        rcf.setInteriorDamageDriver(false);
        rcf.setInteriorDamageTrunk(false);
        rcf.setInteriorDamagePassenger(false);

    }

    public String getCurrDateStr(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now).toString();
    }

    public boolean validateReturn(ReturnCarForm rcf){
        rcf.setTotalFee(CalculateFees(rcf));
        ResetCar(rcf);
        return true;
    }


    public double CalculateFees(ReturnCarForm rcf){
        // Pull Reservation
        Long id = rcf.getRentalId();

        Reservation r = rcf.getReservation();
        double fee = 0; // init fees

        // calculate if car is late. if so, add daily late fee = $500 per day
        long d1 = 0l;
        rcf.setLateReturn(false); // init Late return to false
        //rcf.setLateFee(0.0);
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            Date returnDate = sdf.parse(r.getEndDate().toString());
            Date currentDate = sdf.parse(getCurrDateStr());

            long diff = returnDate.getTime() - currentDate.getTime();

            TimeUnit t1 = TimeUnit.DAYS;
            d1 = t1.convert(diff, TimeUnit.MILLISECONDS);
            if(d1 < 0)
                rcf.setLateReturn(true); // if return date is earlier than current date, then car is LATE!!!
        }catch(Exception e){System.out.println("Parse issue");}

        if(rcf.getLateReturn()){ rcf.setLateFee(500.00);} // if car is late, add late return fee >.<

        // gas fee = up to $50
        if(rcf.getTank()>100)
            rcf.setTank(100); // If tank > 100 for any reason, set to max value
        if(rcf.getTank()<0)
            rcf.setTank(0); // if tank less than 0, set to 0

        rcf.setGasFee(50.00 - (((rcf.getTank())/100)*50));

        // missing extra(s) fee - sunroof is 200, carseat is 70
        //rcf.setExtrasFee(0.0);
        if(rcf.getSunRoof() == null)
            rcf.setSunRoof(true); // edge case set to true if value is null
        if(rcf.getCarSeat() == null)
            rcf.setCarSeat(true);  // edge case set to true if value is null
        if(!rcf.getSunRoof()){rcf.setExtrasFee(rcf.getExtrasFee() + 200.00);}
        if(!rcf.getCarSeat()){rcf.setExtrasFee(rcf.getExtrasFee() + 70.00);}

        // interior damage(s) fee
        //rcf.setDamageFee(0.0);
        if(rcf.getInteriorDamageBack()){rcf.setDamageFee(rcf.getDamageFee() + 100.00);}
        if(rcf.getInteriorDamageDriver()){rcf.setDamageFee(rcf.getDamageFee() + 100.00);}
        if(rcf.getInteriorDamageDriver()){rcf.setDamageFee(rcf.getDamageFee() + 100.00);}
        if(rcf.getInteriorDamagePassenger()){rcf.setDamageFee(rcf.getDamageFee() + 100.00);}

        // exterior damage(s) fee
        if(rcf.getExteriorDamageBack()){rcf.setDamageFee(rcf.getDamageFee() + 100.00);}
        if(rcf.getExteriorDamageFront()){rcf.setDamageFee(rcf.getDamageFee() + 100.00);}
        if(rcf.getExteriorDamageLeft()){rcf.setDamageFee(rcf.getDamageFee() + 100.00);}
        if(rcf.getExteriorDamageRight()){rcf.setDamageFee(rcf.getDamageFee() + 100.00);}

        // mileage fee (+50 per 100m)
        ////--- ???? nothing done for now

        // car rank (will determine fee per day)
        double daily = 0;

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
            //SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            Date start = sdf.parse(r.getStartDate().toString());
            Date end = sdf.parse(r.getEndDate().toString());

            long diff = end.getTime() - start.getTime();

            TimeUnit time = TimeUnit.DAYS;
            days = time.convert(diff, TimeUnit.MILLISECONDS);
        }catch(Exception e){System.out.println("Parse issue");}

        rcf.setRentalFee(daily*days);

        fee = rcf.getExtrasFee() + rcf.getDamageFee() + rcf.getGasFee() + rcf.getLateFee() + rcf.getRentalFee();
        rcf.setTotalFee(fee);
        System.out.println("Rental Fee: " + rcf.getRentalFee());
        System.out.println("Gas Fee: " + rcf.getGasFee());
        System.out.println("Extras Fee: " + rcf.getExtrasFee());
        System.out.println("Damages Fee: " + rcf.getDamageFee());
        System.out.println("Total Fee: " + rcf.getTotalFee());
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
            //ADD - DELETE RESERVATION SQL
            logger.info("CAR SHOULD BE SENT FOR REPAIRS... CAR HAS BEEN REPAIRED...");
            System.out.println("CAR SHOULD BE SENT FOR REPAIRS... CAR HAS BEEN REPAIRED...");
        }
        try{
            // reset car attached to reservation to status "AVAILABLE"
            Car c = rcf.getReservation().getCar(); // pull car
            System.out.println("Car Pulled");
            c.setCarAvailable(true); // reset availability
            System.out.println("Car Set To Available");
            // remove reservation from DB
            reservationRepository.removeReservationById(rcf.getRentalId()); // << 05/26  BUG BUG BUG ERROR HERE!!!!
            System.out.println("Car and Reservation Return Complete");
            return;
        }
        catch(Exception e){
            logger.error("Unable to process reservation and reset car");
            return;}

    }


    //Fetch Reservation for Car Return usage
    public Reservation fetchReservation(Long id) {
        try {
            Reservation r = (Optional.of(reservationRepository.findReservationById(id))
                    .orElseThrow(RuntimeException::new));
            return r;
        } catch (RuntimeException e) {
            logger.error("Reservation not found in DB: " + id );
            return null;
        }
    }


}
