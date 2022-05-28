package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.dto.RegistrationFields;
import edu.depaul.cdm.se452.se452project.entities.Car;
import edu.depaul.cdm.se452.se452project.entities.Dealership;
import edu.depaul.cdm.se452.se452project.entities.Reservation;
import edu.depaul.cdm.se452.se452project.services.ReservationCreationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;


@SessionAttributes("rf")
@Controller
public class ReservationController {

    ReservationCreationService reservationCreationService;

    @Autowired
    public ReservationController(ReservationCreationService reservationCreationService) {
        this.reservationCreationService = reservationCreationService;
    }

    @ModelAttribute
    public void generateModel(Model model) {
        model.addAttribute("rf", new RegistrationFields());
    }

    @GetMapping(value = "/ReservationSearch")
    public String reservationPage(){
        return "ReservationSearch";
    }


    @PostMapping(value = "/createReservationValidate")
    public String createReservationValidate(@ModelAttribute("rf") RegistrationFields registrationFields, Model model){
        // /*
        System.out.println("=====================TESTING===============");
        System.out.println("===========" + registrationFields.getStates()); //TESTING
        System.out.println("===========" + registrationFields.getOptionalCriteria()); //TESTING
        System.out.println("===========" + registrationFields.getRequiredCriteria()); //
        System.out.println("===========" + registrationFields.getStartDate()); //TESTING
        System.out.println("===========" + registrationFields.getEndDate()); //TESTING
        // */
        if(reservationCreationService.validateSearch(registrationFields)) {
            //reservationCreationService.setupResults(registrationFields);

            List<Dealership> dl = registrationFields.getDealershipList();
            model.addAttribute("dealerships", dl);
            return "ReservationSearchResults"; //go to return car form if reservation is found
        }
        else {
            return "ReservationSearch"; // otherwise stay on form // NOTE: -- display error message??? How???
        }
    }


    @PostMapping(value = "/reservationSearchCar")
    public String createReservationDealership(@SessionAttribute("rf") RegistrationFields registrationFields, Model model){
        System.out.println("================" + registrationFields.getSelectedDealershipId()); //TESTING
        registrationFields.setSelectedDealershipId(999l); // TESTING ONLY HARD CODING VALUE <-----------------------------
        System.out.println("=================" +registrationFields.getSelectedDealershipId()); //TESTING
        reservationCreationService.FindCars(registrationFields);
        List<Car> vroom = registrationFields.getCarList();
        model.addAttribute("cars", vroom);
        return "reservationSearchCar"; //TEMPTEMPTEMPTEMPTEMP

    }

    @PostMapping(value = "/reservationSearchComplete")
    public String confirmReservation(@SessionAttribute("rf") RegistrationFields registrationFields, Model model){

        return "reservationSearchComplete"; //TEMPTEMPTEMPTEMPTEMP

    }

    //To-DO
    // Dealership Selection saves the id (maybe just have a field to type the ID)
    // ^ save deal with car selection
    // Confirmation page show details
    // Get customer ID number for reservation somehow??? (and tell Joscelyn so she can do this for viewREservation page
    // In the database add this new reservation -> in /reservation Search Complete



}
