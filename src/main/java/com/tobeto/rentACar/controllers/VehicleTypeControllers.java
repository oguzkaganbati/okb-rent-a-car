package com.tobeto.rentACar.controllers;


import com.tobeto.rentACar.services.abstracts.VehicleTypeService;
import com.tobeto.rentACar.services.dtos.vehicle_type.requests.AddVehicleTypeRequest;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/vehicle_types")
public class VehicleTypeControllers {
    private VehicleTypeService vehicleTypeService;

    public VehicleTypeControllers(VehicleTypeService vehicleTypeService) {
        this.vehicleTypeService = vehicleTypeService;
    }

    @PostMapping
    public void add(@RequestBody AddVehicleTypeRequest addVehicleTypeRequest){
        vehicleTypeService.add(addVehicleTypeRequest);
    }
}
