package com.tobeto.java1aintro.controllers;

import com.tobeto.java1aintro.entities.Vehicle;
import com.tobeto.java1aintro.repositories.VehicleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/vehicles")
public class VehicleControllers {
    private final VehicleRepository vehicleRepository;

    public VehicleControllers(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @GetMapping
    public List<Vehicle> getAll(){
        return vehicleRepository.findAll();
    }

    @GetMapping("{id}")
    public Vehicle getById(@PathVariable int id){
        return vehicleRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(Vehicle vehicle){
        vehicleRepository.save(vehicle);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        Vehicle vehicleToDelete = vehicleRepository.findById(id).orElseThrow();
    }
}
