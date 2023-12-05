package com.tobeto.rentACar.services.dtos.fuel.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddFuelRequest {
    @NotBlank(message = "Fuel name field can not be empty")
    private String fuelName;
}
