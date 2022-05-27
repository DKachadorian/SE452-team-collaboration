package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.dto.RegistrationFields;
import edu.depaul.cdm.se452.se452project.services.ReservationCreationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public String createReservationValidate(@SessionAttribute("rf") RegistrationFields registrationFields){
        System.out.println("=====================TESTING===============");
        System.out.println("===========" + registrationFields.getStates()); //TESTING
        System.out.println("===========" + registrationFields.getOptionalCriteria()); //TESTING
        System.out.println("===========" + registrationFields.getRequiredCriteria()); //
        System.out.println("===========" + registrationFields.getStartDate()); //TESTING
        System.out.println("===========" + registrationFields.getEndDate()); //TESTING
        if(reservationCreationService.validateSearch(registrationFields)) {
            //reservationCreationService.setupResults(registrationFields);
            System.out.println("validated done");
            return "ReservationSearchResults"; //go to return car form if reservation is found
        }
        else {
            return "ReservationSearch"; // otherwise stay on form // NOTE: -- display error message??? How???
        }
    }

    @PostMapping(value = "/createReservationDealerships")
    public String createReservationDealership(@SessionAttribute("rf") RegistrationFields registrationFields){
        System.out.println(registrationFields.getSelectedDealershipId());
        return "homeLoggedIn"; //TEMPTEMPTEMPTEMPTEMP

    }



}
