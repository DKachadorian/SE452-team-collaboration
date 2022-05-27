package edu.depaul.cdm.se452.se452project.services;

import edu.depaul.cdm.se452.se452project.dto.RegistrationFields;
import edu.depaul.cdm.se452.se452project.dto.ReservationSearch;
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
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
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
        System.out.println("===========Entering validation"); //TESTING
        System.out.println("===========" + rs.getStates()); //TESTING
        System.out.println("===========" + rs.getOptionalCriteria()); //TESTING
        System.out.println("===========" + rs.getRequiredCriteria()); //
        System.out.println("===========" + rs.getStartDate()); //TESTING
        System.out.println("===========" + rs.getEndDate()); //TESTING
        // Make sure entered dates are valid first
        if(rs.getEndDate()==null || rs.getStartDate()==null)
            return false;
        System.out.println("===========Dates not null"); //TESTING
        if(!validateDates(rs))
            return false;
        System.out.println("===========Dates Passed"); //TESTING
        // begin search for matching cars
        String carClass = rs.getOptionalCriteria();
        String preferredType = rs.getRequiredCriteria();

        //Finding the Dealerships available
        System.out.println("===========FINDING DEALERSHIPS"); //TESTING
        rs.setDealershipList(dealershipRepository.findDealershipsByState(rs.getStates()));
        /*List<Long> dealershipIdList = new ArrayList<>();

        // if there are results
        if(!rs.getDealershipList().isEmpty()) {
            for (int i = 0; i < rs.getDealershipList().size(); i++) {
                dealershipIdList.add(rs.getDealershipList().get(i).getDealershipId());
                System.out.println("===========Dealership: " + dealershipIdList.get(i)); //TESTING
            }
            //find cars by dealership
           // for()
        }
*/
        return true;
    }

    public void setupResults(RegistrationFields rs){


    }

    // Ensure that rental start date is on or after current date and
    // that rental end date is after rental start date
    public boolean validateDates(RegistrationFields rs){
        System.out.println("===========Validating DatesS"); //TESTING
        Instant nowTime = ZonedDateTime.now().minusDays(1).toInstant();
        Instant insStart = rs.getStartDate().toInstant();
        Instant insEnd = rs.getEndDate().toInstant();
        System.out.println("===========Instant Done"); //TESTING
        if(nowTime.isBefore(insStart)&& insStart.isBefore(insEnd))
            return true;
        else
            return false;

    }

}
