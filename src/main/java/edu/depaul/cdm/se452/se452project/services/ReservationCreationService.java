package edu.depaul.cdm.se452.se452project.services;

import edu.depaul.cdm.se452.se452project.dto.RegistrationFields;
import edu.depaul.cdm.se452.se452project.dto.ReservationSearch;
import edu.depaul.cdm.se452.se452project.entities.Car;
import edu.depaul.cdm.se452.se452project.entities.Dealership;
import edu.depaul.cdm.se452.se452project.entities.Reservation;
import edu.depaul.cdm.se452.se452project.repositories.CarRepository;
import edu.depaul.cdm.se452.se452project.repositories.DealershipRepository;
import edu.depaul.cdm.se452.se452project.repositories.ReservationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.*;

@Service
public class ReservationCreationService {

    Logger logger = LoggerFactory.getLogger(ReservationCreationService.class);

    ReservationRepository reservationRepository;
    DealershipRepository dealershipRepository;
    CarRepository carRepository;


    @Autowired
    public ReservationCreationService(ReservationRepository reservationRepository, DealershipRepository dealershipRepository, CarRepository carRepository) {
        this.reservationRepository = reservationRepository;
        this.dealershipRepository = dealershipRepository;
        this.carRepository = carRepository;
    }

    public boolean validateSearch(RegistrationFields rs){
        // Make sure entered dates are valid first
        if(rs.getEndD()==null || rs.getStartD()==null || rs.getStartD().equals("") || rs.getEndD().equals(""))
            return false;
        if(!validateDates(rs))
            return false;
       //Finding the Dealerships available
        rs.setDealershipList(dealershipRepository.findDealershipsByState(rs.getStates()));
       return true;
    }

    public void setupResults(RegistrationFields rs){    }

    public void FindCars(RegistrationFields rs){
        long id = rs.getSelectedDealershipId();
        try{
            System.out.println("=================Entering find cars" ); //TESTING
            Dealership d = dealershipRepository.findDealershipsById(id);
            System.out.println("=================Found Dealership"); //TESTING
            // if there are no cars at the dealership, stop
            if(d.getCars().size()<1 || d.getCars() == null)
                return;
            else{
                System.out.println("=================Starting to look at cars"); //TESTING
                String str = rs.getRequiredCriteria();

                System.out.println(str);
                if(str.equals("NONE")) {
                    System.out.println("=================Getting car list, nopreference on type"); //TESTING
                    rs.setCarList(carRepository.findCarBySomeRequirements(id, rs.getOptionalCriteria()));
                }
                else{
                    System.out.println("=================getting car list on all types"); //TESTING
                    rs.setCarList(carRepository.findCarByAllRequirements(id, rs.getOptionalCriteria(), rs.getRequiredCriteria()));
                    if(rs.getCarList().isEmpty())
                    {
                        System.out.println("=================empty car list with all criteria"); //TESTING
                        rs.setCarList(carRepository.findCarBySomeRequirements(id, rs.getOptionalCriteria()));
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("The dealership ID became an issue");
        }


    }

    // Ensure that rental start date is on or after current date and
    // that rental end date is after rental start date
    public boolean validateDates(RegistrationFields rs){
        try{
            // String dates to Date dates
            String e = rs.getEndD();
            String s = rs.getStartD();
            SimpleDateFormat form=new SimpleDateFormat("yyyy-MM-dd");
            rs.setStartDate(form.parse(s));
            rs.setEndDate(form.parse(e));
        }
        catch(Exception e){
            System.out.println("Unable to convert values to Date format");
            return false;
        }
        Instant nowTime = ZonedDateTime.now().minusDays(1).toInstant();
        Instant insStart = rs.getStartDate().toInstant();
        Instant insEnd = rs.getEndDate().toInstant();
        if(nowTime.isBefore(insStart)&& insStart.isBefore(insEnd))
            return true;
        else
            return false;

    }

    public List<Dealership> getDealershipDisplay(RegistrationFields rs){
        return dealershipRepository.findDealershipsListById(rs.getSelectedDealershipId());
    }

    public List<Car> getCarDisplay(RegistrationFields rs){
        return carRepository.findCarListById(rs.getSelectedCarId());
    }

}
