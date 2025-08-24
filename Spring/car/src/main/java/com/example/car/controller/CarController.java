package com.example.car.controller;


import org.springframework.ui.Model;
import com.example.car.model.Car;
import com.example.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String listCars(Model model) {
        model.addAttribute("cars", carService.findAll());
        model.addAttribute("newCar", new Car());
        return "cars";
    }


    @PostMapping
    public String addCar(@ModelAttribute("newCar") Car car, Model model) {
        carService.add(car);
        return "redirect:/cars";
    }


}
