package com.tobeto.java1aintro.controllers;

import com.tobeto.java1aintro.entities.RentalType;
import com.tobeto.java1aintro.repositories.RentalTypeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/rental_types")
public class RentalTypeControllers {
    private final RentalTypeRepository rentalTypeRepository;

    public RentalTypeControllers(RentalTypeRepository rentalTypeRepository) {
        this.rentalTypeRepository = rentalTypeRepository;
    }

    @GetMapping
    public List<RentalType> getAll(){
      return  rentalTypeRepository.findAll();
    }

    @GetMapping("{id}")
    public RentalType getById(@PathVariable int id){
        return rentalTypeRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody RentalType rentalType){
        rentalTypeRepository.save(rentalType);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        RentalType rentalTypeToDeleted = rentalTypeRepository.findById(id).orElseThrow();
    }

}
