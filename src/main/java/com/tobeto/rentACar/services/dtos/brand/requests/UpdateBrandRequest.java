package com.tobeto.rentACar.services.dtos.brand.requests;

import lombok.Data;

@Data
public class UpdateBrandRequest {
    private int brandId;
    private String brandName;
}
