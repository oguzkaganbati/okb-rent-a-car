package com.tobeto.rentACar.services.dtos.fuel.requests;

import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class DeleteFuelRequest {

    @Positive(message = "Fuel ID must be a positive number.")
    private int fuelId;
}
