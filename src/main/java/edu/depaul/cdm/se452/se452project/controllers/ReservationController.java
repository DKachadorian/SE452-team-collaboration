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


@SessionAttributes({"rf", "customerId", "todo", "finalres"})
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
        model.addAttribute("customerId", new CustomerId());
        model.addAttribute("todo", new RegistrationFields());
        model.addAttribute("finalres", new RegistrationFields());
    }

    @GetMapping(value = "/reservationSearch")
    public String reservationPage(@ModelAttribute("customerId") CustomerId customerId, Model model){
        return "reservationSearch";
    }


    @PostMapping(value = "/createReservationValidate")
    public String createReservationValidate(@ModelAttribute("rf") RegistrationFields registrationFields, @SessionAttribute("customerId") CustomerId customerId, Model model){

        if(reservationCreationService.validateSearch(registrationFields)) {
            registrationFields.setCustomerId(customerId.getCustomerId());
            List<Dealership> dl = registrationFields.getDealershipList();
            model.addAttribute("dealerships", dl);
            model.addAttribute("todo", registrationFields);
            model.addAttribute("reservationDTO", new ReservationDTO());
            //System.out.println("============== customer ID: " + registrationFields.getCustomerId());
            return "reservationSearchResults"; //go to return car form if reservation is found
        }
        else {
            return "reservationSearch"; // otherwise stay on form // NOTE: -- display error message??? How???
        }
    }


    @PostMapping(value = "/reservationSearchCar")
    public String createReservationDealerships(@SessionAttribute("rf") RegistrationFields registrationFields,
                                               @ModelAttribute("reservationDTO") ReservationDTO reservationDTO,
                                               @ModelAttribute("todo") RegistrationFields registrationFields2, Model model){
        registrationFields.setSelectedDealershipId(reservationDTO.getSelectedDealershipId());
        reservationCreationService.FindCars(registrationFields);
        List<Car> vroom = registrationFields.getCarList();
        model.addAttribute("cars", vroom);
        reservationCreationService.copyDTO(registrationFields, registrationFields2);
        model.addAttribute("reservationDTOCar", new ReservationDTO());
        return "reservationSearchCar";

    }

    @PostMapping(value = "/reservationSearchComplete")
    public String confirmReservation(@SessionAttribute("todo") RegistrationFields registrationFields,
                                     @ModelAttribute("reservationDTOCar") ReservationDTO reservationDTO,
                                     @ModelAttribute("finalres") RegistrationFields registrationFields2,Model model){
        registrationFields.setSelectedCarId(reservationDTO.getSelectedCarId());

        reservationCreationService.copyDTO(registrationFields, registrationFields2);
        List<Dealership> dl = reservationCreationService.getDealershipDisplay(registrationFields);
        List<Car> cl = reservationCreationService.getCarDisplay(registrationFields);
        model.addAttribute("finalDealerships", dl);
        model.addAttribute("finalCars", cl);
        reservationCreationService.createReservation(registrationFields2);
        return "reservationSearchComplete";

    }

    @PostMapping(value = "/ReservationConfirmed")
     public String confirmed(@SessionAttribute("finalres") RegistrationFields registrationFields, Model model)
    {
            // Logout on confirmation due to loss of customer ID on return to home screen [KNOWN BUG]
            return "home";

    }


    //To-DO
    // Dealership Selection saves the id (maybe just have a field to type the ID)
    // ^ save deal with car selection
    // Confirmation page show details
    // Get customer ID number for reservation somehow??? (and tell Joscelyn so she can do this for viewREservation page
    // In the database add this new reservation -> in /reservation Search Complete



}
