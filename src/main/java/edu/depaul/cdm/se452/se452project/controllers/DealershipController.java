package edu.depaul.cdm.se452.se452project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.depaul.cdm.se452.se452project.entities.Dealership;
import edu.depaul.cdm.se452.se452project.repositories.DealershipRepository;
import edu.depaul.cdm.se452.se452project.services.DealershipService;

@Controller
public class DealershipController {

    DealershipRepository dealershipRepository;
    DealershipService dealershipService;

    public DealershipController(@Autowired DealershipService dealershipService) {
        this.dealershipService = dealershipService;
    }

    //public DealershipController(DealershipRepository dealershipRepository) {
   //     this.dealershipRepository = dealershipRepository;
   // }

    @GetMapping(value="/viewDealerships")
    public String groupByDealershipLocation(Model model){
        List<Dealership> dealerships = dealershipService.findAllDealerships();
        model.addAttribute("dealership", dealerships);
        return "viewDealerships";
    }

    }


