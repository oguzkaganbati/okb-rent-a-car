package com.tobeto.rentACar.services.dtos.fuel.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class UpdateFuelRequest {

    @Positive(message = "Fuel ID must be a positive number.")
    private int fuelId;

    @NotBlank(message = "Fuel name cannot be blank.")
    private String fuelName;
}
