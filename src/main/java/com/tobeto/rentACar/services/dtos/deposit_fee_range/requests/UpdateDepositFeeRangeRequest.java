package com.tobeto.rentACar.services.dtos.deposit_fee_range.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class UpdateDepositFeeRangeRequest {

    @Positive(message = "Deposit fee range ID must be a positive number.")
    private int depositFeeRangeId;

    @NotBlank(message = "Deposit fee range name cannot be blank.")
    private String depositFeeRangeName;
}
