package com.tobeto.java1aintro.controllers;

import com.tobeto.java1aintro.entities.Fuel;
import com.tobeto.java1aintro.repositories.FuelRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/fuels")
public class FuelControllers {

    private final FuelRepository fuelRepository;

    public FuelControllers(FuelRepository fuelRepository) {
        this.fuelRepository = fuelRepository;
    }

    @GetMapping

    public List<Fuel> getAll(){
        return fuelRepository.findAll();
    }

    @GetMapping({"id"})
    public Fuel getById(@PathVariable int id){
        return fuelRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Fuel fuel){
        fuelRepository.save(fuel);
    }

    @DeleteMapping({"id"})
    public void delete(@PathVariable int id){
        Fuel fuelToDelete = fuelRepository.findById(id).orElseThrow();
    }

}
