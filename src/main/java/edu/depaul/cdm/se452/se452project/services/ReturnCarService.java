package edu.depaul.cdm.se452.se452project.services;

import edu.depaul.cdm.se452.se452project.dto.ReturnCarForm;
import edu.depaul.cdm.se452.se452project.entities.Car;
import edu.depaul.cdm.se452.se452project.entities.Customer;
import edu.depaul.cdm.se452.se452project.repositories.CustomerRepository;
import edu.depaul.cdm.se452.se452project.entities.Reservation;
import edu.depaul.cdm.se452.se452project.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class ReturnCarService {
    CustomerRepository customerRepository;
    ReservationRepository reservationRepository;

    @Autowired
    ReturnCarService(CustomerRepository customerRepository, ReservationRepository reservationRepository){
        this.customerRepository = customerRepository; this.reservationRepository = reservationRepository;
    }

    public double CalculateFees(ReturnCarForm rcf){
        // late fee = $500
        double fee = 0;
        if(rcf.getLateReturn()){ fee += 500;}

        // gas fee = up to $50
        fee += (50 - (((rcf.getFullTank())/100)*50));

        // missing extra(s) fee - sunroof is 200, carseat is 70
        if(!rcf.getDamagedSunRoof()){fee += 200;}
        if(!rcf.getMissingCarSeat()){fee += 70;}

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

        Car car = r.getCar();
        switch(car.getCarClass()){
            case "LUXURY":
                daily = 485;
                break;
            case"ECONOMY PLUS":
                daily = 295;
                break;
            default:
                daily = 95;
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

    //METHOD: Get customer and car info to set form up


}
