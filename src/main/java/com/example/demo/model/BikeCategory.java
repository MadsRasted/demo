package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class BikeCategory {
    public BikeCategory() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    Set<Bike> bikes;
}
