package com.example.demo.repository;

import com.example.demo.model.Bike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBikeRepository extends CrudRepository<Bike, Long> {

}
