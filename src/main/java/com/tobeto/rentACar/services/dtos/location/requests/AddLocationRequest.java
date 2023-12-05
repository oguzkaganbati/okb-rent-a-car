package com.tobeto.rentACar.services.dtos.location.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddLocationRequest {

    @NotBlank(message = "Location name field can not be empty")
    private String locationName;
}
