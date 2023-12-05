package com.tobeto.rentACar.controllers;


import com.tobeto.rentACar.services.abstracts.FuelService;
import com.tobeto.rentACar.services.dtos.fuel.requests.AddFuelRequest;
import com.tobeto.rentACar.services.dtos.fuel.requests.DeleteFuelRequest;
import com.tobeto.rentACar.services.dtos.fuel.requests.UpdateFuelRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/fuels")
public class FuelControllers {
    private FuelService fuelService;

    public FuelControllers(FuelService fuelService) {
        this.fuelService = fuelService;
    }

    @PostMapping
    public void add(@RequestBody @Valid AddFuelRequest addFuelRequest){
        fuelService.add(addFuelRequest);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody @Valid DeleteFuelRequest deleteFuelRequest){
        fuelService.delete(deleteFuelRequest);
    }

    @PutMapping("/update")
    public void update(@RequestBody @Valid UpdateFuelRequest updateFuelRequest){
        fuelService.update(updateFuelRequest);
    }
}
