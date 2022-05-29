package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.dto.CustomerId;
import edu.depaul.cdm.se452.se452project.dto.RegistrationFields;
import edu.depaul.cdm.se452.se452project.dto.ReservationDTO;
import edu.depaul.cdm.se452.se452project.entities.Car;
import edu.depaul.cdm.se452.se452project.entities.Dealership;
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

    @GetMapping(value = "/reservationSearch")
    public String reservationPage(@ModelAttribute("cuid") CustomerId customerId, Model model){
        model.addAttribute("cuid", customerId);
        return "reservationSearch";
    }


    @PostMapping(value = "/createReservationValidate")
    public String createReservationValidate(@ModelAttribute("rf") RegistrationFields registrationFields, Model model){

        if(reservationCreationService.validateSearch(registrationFields)) {

            List<Dealership> dl = registrationFields.getDealershipList();
            model.addAttribute("dealerships", dl);
            model.addAttribute("todo", registrationFields);
            model.addAttribute("reservationDTO", new ReservationDTO());
            return "reservationSearchResults"; //go to return car form if reservation is found
        }
        else {
            return "reservationSearch"; // otherwise stay on form // NOTE: -- display error message??? How???
        }
    }


    @PostMapping(value = "/reservationSearchCar")
    public String createReservationDealerships(@ModelAttribute("rf") RegistrationFields registrationFields,
                                               @ModelAttribute("reservationDTO") ReservationDTO reservationDTO, Model model){

        registrationFields.setSelectedDealershipId(reservationDTO.getSelectedDealershipId());
        reservationCreationService.FindCars(registrationFields);
        List<Car> vroom = registrationFields.getCarList();
        model.addAttribute("cars", vroom);
        model.addAttribute("todo", registrationFields);

        return "reservationSearchCar";

    }

    @PostMapping(value = "/reservationSearchComplete")
    public String confirmReservation(@SessionAttribute("rf") RegistrationFields registrationFields, Model model, @ModelAttribute("rf") RegistrationFields rf){
        registrationFields.setSelectedCarId(rf.getSelectedCarId());
        System.out.println("================" + registrationFields.getSelectedCarId()); //TESTING
        System.out.println("================" + registrationFields.getSelectedDealershipId()); //TESTING
        registrationFields.setSelectedCarId(24l); // TESTING ONLY HARD CODING VALUE <-------------------------------
        registrationFields.setSelectedDealershipId(999l); // TESTING ONLY HARD CODING VALUE <-----------------------------
        System.out.println("=================" +registrationFields.getSelectedDealershipId()); //TESTING
        System.out.println("=================" +registrationFields.getSelectedCarId()); //TESTING
        List<Dealership> dl = reservationCreationService.getDealershipDisplay(registrationFields);
        List<Car> cl = reservationCreationService.getCarDisplay(registrationFields);
        model.addAttribute("finalDealerships", dl);
        model.addAttribute("finalCars", cl);
        reservationCreationService.createReservation(registrationFields);
        return "reservationSearchComplete"; //TEMPTEMPTEMPTEMPTEMP

    }

    @PostMapping(value = "/ReservationConfirmed")
     public String confirmed()
    {
        //Session.setComplete(); // Do we need to close session????
       return "homeLoggedIn";
    }

    //To-DO
    // Dealership Selection saves the id (maybe just have a field to type the ID)
    // ^ save deal with car selection
    // Confirmation page show details
    // Get customer ID number for reservation somehow??? (and tell Joscelyn so she can do this for viewREservation page
    // In the database add this new reservation -> in /reservation Search Complete



}
