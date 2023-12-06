package com.tobeto.rentACar.controllers;

import com.tobeto.rentACar.entities.Vehicle;
import com.tobeto.rentACar.repositories.VehicleRepository;
import com.tobeto.rentACar.services.abstracts.VehicleService;
import com.tobeto.rentACar.services.dtos.vehicle.responses.GetVehicleListByFuelTypeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/vehicles")
public class VehicleControllers {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/dto/byFuelName")
    List<GetVehicleListByFuelTypeResponse> getByFuelNameDto(@RequestParam String fuelName){
        return vehicleService.getByFuelNameDto(fuelName);
    }

}
