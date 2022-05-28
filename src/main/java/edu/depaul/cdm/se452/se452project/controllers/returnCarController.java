package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.dto.ReservationSearch;
import edu.depaul.cdm.se452.se452project.dto.ReturnCarForm;
import edu.depaul.cdm.se452.se452project.services.ReservationSearchService;
import edu.depaul.cdm.se452.se452project.services.ReturnCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@SessionAttributes("rcf")
@Controller
public class returnCarController {

    ReservationSearchService reservationSearchService;
    ReturnCarService returnCarService;

    @Autowired
    public returnCarController(ReservationSearchService reservationSearchService, ReturnCarService returnCarService) {
        this.reservationSearchService = reservationSearchService; this.returnCarService = returnCarService;}

    @ModelAttribute
    public void generateModel(Model model) {
        model.addAttribute("reservationSearch", new ReservationSearch());
        model.addAttribute("rcf", new ReturnCarForm());
    }

    @GetMapping(value = "/returnCar")
    public String returnCar(){
        return "returnCar";
    }

    @PostMapping(value = "/returnCarSearch")
    public String returnCarResults(@ModelAttribute(value="id") ReservationSearch reservationSearch, @ModelAttribute(value="rcf") ReturnCarForm returnCarForm){

        if(reservationSearchService.validateReservation(reservationSearch)) {
            returnCarService.setupReturn(returnCarForm, reservationSearch);
            return "returnCarForm"; //go to return car form if reservation is found
        }
        else {
            return "returnCar"; // otherwise stay on form // NOTE: -- display error message??? How???
        }
    }

    @GetMapping(value = "/returnCarForm")
    public String returnCarForm(){
        return "returnCarForm";
    }

    @PostMapping(value="/returnCarFormCalculate")
    public String calculateReturnForm(@SessionAttribute("rcf") ReturnCarForm returnCarForm) {
        if(returnCarService.validateReturn(returnCarForm)){
            System.out.println("FEEEEEEEES " + returnCarForm.getTotalFee());
          return "returnCarResults";
        }
        return "returnCarForm";
    }

    /*
    @PostMapping(value="/returnCarFormVerification")
    public String validateReturnForm(@SessionAttribute("rcf") ReturnCarForm returnCarForm) {
        System.out.println("FEEEEEEEES After Load22    " + returnCarForm.getTotalFee());
        return "homeLoggedInEmp"; //Return Complete
    } */

    @PostMapping(value="/returnCarComplete")
    public String returnCarComplete(@SessionAttribute("rcf") ReturnCarForm returnCarForm){
        System.out.println("FEEEEEEEES After Load    " + returnCarForm.getTotalFee());
        return "homeLoggedInEmp"; //Return Complete
    }
}
