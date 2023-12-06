package com.tobeto.rentACar.services.dtos.vehicle.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetVehicleListByFuelTypeResponse {
    private int id;
    private String brandName;
    private String modelName;
}
