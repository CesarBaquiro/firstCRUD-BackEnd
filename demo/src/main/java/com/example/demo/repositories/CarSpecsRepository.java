package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.CarSpecsModel;

public interface CarSpecsRepository extends JpaRepository<CarSpecsModel, Long>{

}
