package com.tobeto.rentACar.services.dtos.vehicle.requests;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddVehicleRequest {
    private BigDecimal pricePerDay;
    private BigDecimal pricePerMonth;
    private BigDecimal mileageLimit;
    private BigDecimal depositFee;
}
