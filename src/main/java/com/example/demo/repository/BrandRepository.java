package com.example.demo.repository;

import com.example.demo.model.Bike;
import com.example.demo.model.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BrandRepository {

    public BrandRepository() {
    }

    @Autowired
    IBrandRepository iBrandRepository;

    public List<Brand> readAll(){
        List<Brand> brands = new ArrayList<>();
        iBrandRepository.findAll().forEach(brand -> brands.add(brand));
        return brands;
    }

}

