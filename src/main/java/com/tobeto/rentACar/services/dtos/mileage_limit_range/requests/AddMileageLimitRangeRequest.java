package com.tobeto.rentACar.services.dtos.mileage_limit_range.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddMileageLimitRangeRequest {

    @NotBlank(message = "Mileage limit name field can not be empty")
    private String mileAgeLimitName;
}
