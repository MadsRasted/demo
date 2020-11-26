package com.example.demo.controller;

import com.example.demo.model.Bike;
import com.example.demo.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BikeController {

    public BikeController() {
    }

    @Autowired
    BikeRepository bikeRepository;

    @GetMapping("/bikeList")
    public String bikeList(Model model){
        model.addAttribute("bikes", bikeRepository.readAll());
        return "bikeList";
    }

    @GetMapping("/addBike")
    public String addBike(Model model){
        model.addAttribute("bike", new Bike());
        return "addBike";
    }

    @PostMapping("/addBike")
    public String addBike(HttpServletRequest request){
        String modelName = request.getParameter("modelName");
        int frameSize = Integer.parseInt(request.getParameter("frameSize"));
        int wheelSize = Integer.parseInt(request.getParameter("wheelSize"));
        Bike bike = new Bike(modelName, frameSize, wheelSize);
        bikeRepository.addBike(bike);
        return "redirect:/bikeList";
    }
}
