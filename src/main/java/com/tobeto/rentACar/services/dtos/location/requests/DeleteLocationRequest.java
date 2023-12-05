package com.tobeto.rentACar.services.dtos.location.requests;

import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class DeleteLocationRequest {

    @Positive(message = "Location ID must be a positive number!")
    private int locationId;
}
