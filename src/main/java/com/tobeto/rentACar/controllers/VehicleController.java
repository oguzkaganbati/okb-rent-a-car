package com.tobeto.rentACar.controllers;

import com.tobeto.rentACar.services.abstracts.VehicleService;
import com.tobeto.rentACar.services.dtos.vehicle.requests.AddVehicleRequest;
import com.tobeto.rentACar.services.dtos.vehicle.responses.GetVehicleListByFuelTypeResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/dto/byFuelName")
    public ResponseEntity<List<GetVehicleListByFuelTypeResponse>> getByFuelNameDto(@RequestParam String fuelName) {
        List<GetVehicleListByFuelTypeResponse> response = vehicleService.getByFuelNameDto(fuelName);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<String> add(@Valid @RequestBody AddVehicleRequest addVehicleRequest) {
        vehicleService.add(addVehicleRequest);
        return ResponseEntity.ok("Vehicle added successfully.");
    }
}
