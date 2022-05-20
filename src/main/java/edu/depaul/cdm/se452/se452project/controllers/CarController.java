package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.entities.Car;
import edu.depaul.cdm.se452.se452project.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CarController {

    CarRepository carRepository;

    @Autowired
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping(value="/viewCars")
    public String viewCars(Model model) {

        List<Car> carList = carRepository.findAll();
        model.addAttribute("cars", carList);

        return "viewCars";
    }
}