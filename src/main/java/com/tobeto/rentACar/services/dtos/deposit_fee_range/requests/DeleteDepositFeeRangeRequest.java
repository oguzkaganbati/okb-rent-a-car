package com.tobeto.rentACar.services.dtos.deposit_fee_range.requests;

import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class DeleteDepositFeeRangeRequest {

    @Positive(message = "Deposit fee range ID must be a positive number!")
    private int depositFeeRangeId;
}
