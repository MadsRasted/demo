package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelName;
    private int frameSize;
    private int wheelSize;

    @ManyToOne
    private Brand brand;

    @ManyToMany(mappedBy = "bikes")
    private Set<BikeCategory> categories;

    public Bike() {
    }

    public Bike(String modelName, int frameSize, int wheelSize){
        this.modelName = modelName;
        this.wheelSize = wheelSize;
        this.frameSize = frameSize;
    }

    public Bike(Long id, String modelName, int frameSize, int wheelSize, int brandId){
        this.id = id;
        this.modelName = modelName;
        this.frameSize = frameSize;
        this.wheelSize = wheelSize;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Set<BikeCategory> getCategories() {
        return categories;
    }

    public void setCategories(Set<BikeCategory> categories) {
        this.categories = categories;
    }
}
