package com.tobeto.rentACar.services.dtos.brand.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class UpdateBrandRequest {
    @Positive(message = "Brand ID must be a positive number.")
    private int brandId;

    @NotBlank(message = "Brand name cannot be blank.")
    private String brandName;
}
