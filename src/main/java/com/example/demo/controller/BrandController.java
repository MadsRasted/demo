package com.example.demo.controller;

import com.example.demo.model.Bike;
import com.example.demo.repository.BikeRepository;
import com.example.demo.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BrandController {

    public BrandController() {
    }

    @Autowired
    BrandRepository brandRepository;

    @GetMapping("/brandList")
    public String brandList(Model model){
        model.addAttribute("brands", brandRepository.readAll());
        return "brandList";
    }
}
