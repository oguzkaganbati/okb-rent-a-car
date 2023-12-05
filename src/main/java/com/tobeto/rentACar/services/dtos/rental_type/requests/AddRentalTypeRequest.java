package com.tobeto.rentACar.services.dtos.rental_type.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddRentalTypeRequest {
    @NotBlank(message = "Rental type name field can not be empty!")
    private String rentalTypeName;
}
