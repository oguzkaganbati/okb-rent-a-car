package com.tobeto.rentACar.services.dtos.location.requests;

import lombok.Data;

@Data
public class UpdateLocationRequest {
    private int locationId;
    private String locationName;

}
