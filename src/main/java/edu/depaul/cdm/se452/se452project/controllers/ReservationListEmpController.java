package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.dto.CustomerId;
import edu.depaul.cdm.se452.se452project.dto.RegistrationFields;
import edu.depaul.cdm.se452.se452project.entities.Reservation;
import edu.depaul.cdm.se452.se452project.services.ReservationSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ReservationListEmpController {

    ReservationSearchService reservationSearchService;

    @Autowired
    public ReservationListEmpController(ReservationSearchService reservationSearchService) {
        this.reservationSearchService = reservationSearchService;
    }


    @GetMapping(value = "/reservationListEmp")
    public String reservationListEmp(Model model) {

        List<Reservation> reservationList = reservationSearchService.findAllReservationsEmp();
        model.addAttribute("reservations", reservationList);

        return "reservationListEmp";
    }
}
