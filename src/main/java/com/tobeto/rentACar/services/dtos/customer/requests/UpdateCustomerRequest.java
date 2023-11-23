package com.tobeto.rentACar.services.dtos.customer.requests;

import lombok.Data;

import java.util.Date;

@Data
public class UpdateCustomerRequest {
    private int customerId;
    private String customerFirstName;
    private String customerLastName;
    private Date customerBirthDate;
    private Boolean customerHasValidLicence;

}
