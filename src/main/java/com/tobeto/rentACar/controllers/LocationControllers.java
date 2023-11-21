package com.tobeto.java1aintro.controllers;

import com.tobeto.java1aintro.entities.Location;
import com.tobeto.java1aintro.repositories.LocationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/locations")
public class LocationControllers {
    private final LocationRepository locationRepository;

    public LocationControllers(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @GetMapping
    public List<Location> getAll(){
        return locationRepository.findAll();
    }

    @GetMapping("{id}")
    public Location getById(@PathVariable int id){
        return locationRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Location location){
        locationRepository.save(location);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        Location locationToDelete = locationRepository.findById(id).orElseThrow();
    }

}
