
package edu.depaul.cdm.se452.se452project.controllers;


import edu.depaul.cdm.se452.se452project.entities.Reservation;
import edu.depaul.cdm.se452.se452project.services.ReservationSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;


@Controller
public class ReservationListCustController {

    ReservationSearchService reservationSearchService;

    @Autowired
    public ReservationListCustController(ReservationSearchService reservationSearchService) {
        this.reservationSearchService = reservationSearchService;
    }


    @GetMapping(value = "/reservationList")
    public String viewReservations(@ModelAttribute("customerId") Long customerId, Model model) {

        List<Reservation> reservationList = reservationSearchService.findAllReservations(customerId);
        model.addAttribute("reservations", reservationList);

        return "reservationList";
    }
}
