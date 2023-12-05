package com.tobeto.rentACar.services.dtos.brand.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddBrandRequest {

    @NotBlank(message = "Brand name field can not be empty!")
    private String brandName;

}
