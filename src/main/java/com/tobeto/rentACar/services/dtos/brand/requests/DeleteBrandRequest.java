package com.tobeto.rentACar.services.dtos.brand.requests;

import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class DeleteBrandRequest {

    @Positive(message = "Brand ID must be a positive number.")
    private int brandId;
}
