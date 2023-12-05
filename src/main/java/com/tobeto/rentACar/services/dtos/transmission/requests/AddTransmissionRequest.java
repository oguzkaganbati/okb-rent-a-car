package com.tobeto.rentACar.services.dtos.transmission.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddTransmissionRequest {

    @NotBlank(message = "Transmission name field can not be empty!")
    private String transmissionName;
}
