package com.tobeto.rentACar.services.dtos.fuel.requests;

import lombok.Data;

@Data
public class UpdateFuelRequest {
    private int fuelId;
    private String fuelName;
}
