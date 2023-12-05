package com.tobeto.rentACar.controllers;


import com.tobeto.rentACar.services.abstracts.LocationService;
import com.tobeto.rentACar.services.dtos.location.requests.AddLocationRequest;
import com.tobeto.rentACar.services.dtos.location.requests.DeleteLocationRequest;
import com.tobeto.rentACar.services.dtos.location.requests.UpdateLocationRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/locations")
public class LocationControllers {
    private LocationService locationService;

    public LocationControllers(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping
    public void add(@RequestBody @Valid AddLocationRequest addLocationRequest){
        locationService.add(addLocationRequest);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody @Valid DeleteLocationRequest deleteLocationRequest){
        locationService.delete(deleteLocationRequest);
    }

    @PutMapping("/update")
    public void update(@RequestBody @Valid UpdateLocationRequest updateLocationRequest){
        locationService.update(updateLocationRequest);
    }
}
