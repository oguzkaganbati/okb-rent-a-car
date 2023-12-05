package com.tobeto.rentACar.services.dtos.price_range.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddPriceRangeRequest {

    @NotBlank(message = "Price range name field can not be empty!")
    private String priceRangeName;
}
