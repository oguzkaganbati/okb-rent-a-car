package com.tobeto.rentACar.services.dtos.deposit_fee_range.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddDepositFeeRangeRequest {
    @NotBlank(message = "Deposit fee range name can not be empty")
    private String depositFeeRangeName;
}
