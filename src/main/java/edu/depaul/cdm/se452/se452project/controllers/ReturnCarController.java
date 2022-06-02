package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.dto.ReservationSearch;
import edu.depaul.cdm.se452.se452project.dto.ReturnCarFees;
import edu.depaul.cdm.se452.se452project.dto.ReturnCarForm;
import edu.depaul.cdm.se452.se452project.services.ReservationSearchService;
import edu.depaul.cdm.se452.se452project.services.ReturnCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;

@SessionAttributes({"rcf", "fees", "id"})
@Controller
public class ReturnCarController {

    ReservationSearchService reservationSearchService;
    ReturnCarService returnCarService;

    @Autowired
    public ReturnCarController(ReservationSearchService reservationSearchService, ReturnCarService returnCarService) {
        this.reservationSearchService = reservationSearchService; this.returnCarService = returnCarService;}

    @ModelAttribute
    public void generateModel(Model model) {
        model.addAttribute("id", new ReservationSearch());
        model.addAttribute("rcf", new ReturnCarForm());
        model.addAttribute("fees", new ReturnCarFees());
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
    public String calculateReturnForm(@ModelAttribute("rcf") ReturnCarForm returnCarForm, @ModelAttribute("fees") ReturnCarFees returnCarFees, @SessionAttribute("id") ReservationSearch reservationSearch) {
        if(returnCarService.validateReturn(returnCarForm, returnCarFees, reservationSearch)){
          return "returnCarResults";
        }
        return "returnCarForm";
    }


    @PostMapping(value="/returnCarComplete")
    public String returnCarComplete(@SessionAttribute("fees") ReturnCarFees returnCarFees, WebRequest request, SessionStatus status){
        status.setComplete();
        request.removeAttribute("rcf", WebRequest.SCOPE_SESSION);
        return "homeLoggedInEmp"; //Return Complete
    }
}
