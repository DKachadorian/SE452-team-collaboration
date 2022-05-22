package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.entities.Reservation;
import edu.depaul.cdm.se452.se452project.repositories.ReservationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;



@Controller
public class ReservationController {

    ReservationRepository reservationRepository;

    @Autowired
    public ReservationController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping(value = "/ReservationSearch")
    public String reservationPage(){
        return "ReservationSearch";
    }


    @GetMapping(value = "/ReservationSearchResults")
    public String reservationResultsResultsPage(Model model){
        List<Reservation> reservationList = reservationRepository.findAll();
        model.addAttribute("reservations", reservationList);

        return "ReservationSearchResults";
    }

}
