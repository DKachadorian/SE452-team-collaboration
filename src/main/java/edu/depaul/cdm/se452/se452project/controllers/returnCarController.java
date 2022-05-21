package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.dto.ReservationSearch;
import edu.depaul.cdm.se452.se452project.services.ReservationSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class returnCarController {


    ReservationSearchService reservationSearchService;

    @Autowired
    public returnCarController(ReservationSearchService reservationSearchService) {
        this.reservationSearchService = reservationSearchService;}

    @ModelAttribute
    public void generateModel(Model model) {
        model.addAttribute("reservationSearch", new ReservationSearch());
    }

    @GetMapping(value = "/returnCar")
    public String returnCar(){
        return "returnCar";
    }

    @PostMapping(value = "/returnCarError")
    public String returnCarResults(@ModelAttribute(value="id") ReservationSearch reservationSearch){

        if(reservationSearchService.validateReservation(reservationSearch)) {
            return "returnCarForm"; //go to return car form if reservation is found
        }
        return "returnCar"; // otherwise stay on form // NOTE: -- display error message??? How???
    }
}
