package com.example.demo.repository;

import com.example.demo.model.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BikeRepository {

    public BikeRepository() {
    }

    @Autowired
    IBikeRepository iBikeRepository;

    public List<Bike> readAll(){
        List<Bike> bikes = new ArrayList<>();
        iBikeRepository.findAll().forEach(bike -> bikes.add(bike));
        return bikes;
    }

    public void addBike(Bike bike){
        iBikeRepository.save(bike);
    }
}
