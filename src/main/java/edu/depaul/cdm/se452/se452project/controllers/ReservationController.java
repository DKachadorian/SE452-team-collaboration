package edu.depaul.cdm.se452.se452project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ReservationController {

    @GetMapping(value = "/ReservationSearch")
    public String reservationPage(){
        return "ReservationSearch";
    }
    
}
