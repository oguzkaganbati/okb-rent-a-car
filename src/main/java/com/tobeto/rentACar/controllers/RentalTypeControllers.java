package com.tobeto.rentACar.controllers;


import com.tobeto.rentACar.services.abstracts.RentalTypeService;
import com.tobeto.rentACar.services.dtos.rental_type.requests.AddRentalTypeRequest;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/rental_types")
public class RentalTypeControllers {
    private RentalTypeService rentalTypeService;

    public RentalTypeControllers(RentalTypeService rentalTypeService) {
        this.rentalTypeService = rentalTypeService;
    }

    @PostMapping
    public void add(@RequestBody AddRentalTypeRequest addRentalTypeRequest){
        rentalTypeService.add(addRentalTypeRequest);
    }
}
