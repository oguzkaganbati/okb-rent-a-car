package com.tobeto.rentACar.services.dtos.customer.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Data;

import java.util.Date;

@Data
public class AddCustomerRequest {

    @NotBlank(message = "First name field can not be empty!")
    private String firstName;

    @NotBlank(message = "Last name field can not be empty!")
    private String lastName;

    @NotNull(message = "Valid licence must be specified!")
    private Boolean isValidLicence;

    @Past(message = "Birth date must be in the past!")
    private Date birth_date;
}
