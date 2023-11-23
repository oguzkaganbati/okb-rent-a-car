package com.tobeto.rentACar.services.dtos.customer.requests;

import lombok.Data;

import java.util.Date;

@Data
public class AddCustomerRequest {
    private String first_name;
    private String last_name;
    private Boolean isValidLicence;
    private Date birth_date;
}
