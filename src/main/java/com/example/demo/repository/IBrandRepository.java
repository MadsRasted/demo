package com.example.demo.repository;

import com.example.demo.model.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBrandRepository extends CrudRepository<Brand, Long> {
}
