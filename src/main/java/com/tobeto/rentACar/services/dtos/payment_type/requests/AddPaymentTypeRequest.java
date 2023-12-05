package com.tobeto.rentACar.services.dtos.payment_type.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddPaymentTypeRequest {

    @NotBlank(message = "Payment type name field can not be empty!")
    private String paymentTypeName;
}
