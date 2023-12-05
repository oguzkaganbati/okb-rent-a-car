package com.tobeto.rentACar.services.dtos.customer.requests;

import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class DeleteCustomerRequest {

    @Positive(message = "Customer ID must be a positive number.")
    private int customerId;
}
