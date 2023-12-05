package com.tobeto.rentACar.services.dtos.location.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class UpdateLocationRequest {

    @Positive(message = "Location ID must be a positive number.")
    private int locationId;

    @NotBlank(message = "Location name cannot be blank.")
    private String locationName;
}
