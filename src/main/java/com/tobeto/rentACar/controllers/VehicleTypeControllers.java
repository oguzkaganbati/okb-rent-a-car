package com.tobeto.java1aintro.controllers;

import com.tobeto.java1aintro.entities.VehicleType;
import com.tobeto.java1aintro.repositories.VehicleTypeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/vehicle_types")
public class VehicleTypeControllers {

    private final VehicleTypeRepository vehicleTypeRepository;

    public VehicleTypeControllers(VehicleTypeRepository vehicleTypeRepository) {
        this.vehicleTypeRepository = vehicleTypeRepository;
    }

    @GetMapping
    public List<VehicleType> getAll(){
        return vehicleTypeRepository.findAll();
    }

    @GetMapping("{id}")
    public VehicleType getById(@PathVariable int id){
      return  vehicleTypeRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody VehicleType vehicleType){
        vehicleTypeRepository.save(vehicleType);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        VehicleType vehicleTypeToDelete = vehicleTypeRepository.findById(id).orElseThrow();
    }


}
