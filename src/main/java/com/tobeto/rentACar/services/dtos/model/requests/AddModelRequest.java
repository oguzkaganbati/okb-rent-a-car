package com.tobeto.rentACar.services.dtos.model.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddModelRequest {
    @NotBlank(message = "Model name field can not be empty!")
    private String modelName;
}
