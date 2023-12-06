package com.tobeto.rentACar.services.dtos.customer.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListValidLicenceCostumerResponse {
    private int id;
    private String firstName;
    private String lastName;
}
