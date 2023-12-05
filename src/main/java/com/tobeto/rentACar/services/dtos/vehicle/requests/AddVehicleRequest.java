package com.tobeto.rentACar.services.dtos.vehicle.requests;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddVehicleRequest {

    @Positive(message = "Daily price must be a positive value.")
    @Min(value = 100, message = "Daily price cannot be less than 100 TRY!")
    private BigDecimal pricePerDay;

    @Positive(message = "Monthly price must be a positive value.")
    @Min(value = 3000, message = "Monthly price cannot be less than 3000 TRY!")
    private BigDecimal pricePerMonth;

    @Positive(message = "Mileage limit must be a positive value.")
    @Min(value = 100, message = "Mileage limit cannot be less than 100 km!")
    private BigDecimal mileageLimit;

    @Positive(message = "Deposit fee must be a positive value.")
    @Min(value = 500, message = "Deposit fee cannot be less than 500 TRY")
    private BigDecimal depositFee;

    @NotBlank(message = "Plate field cannot be empty!")
    @Max(value = 8, message = "Plate number cannot be more than 8 characters!")
    @Min(value = 7, message = "Plate number cannot be less than 7 characters!")
    private String plate;

    @NotNull(message = "Brand ID must be specified.")
    private int brandId;

    @NotNull(message = "Model ID must be specified.")
    private int modelId;

    @NotNull(message = "Fuel type ID must be specified.")
    private int fuelTypeId;

    @NotNull(message = "Transmission ID must be specified.")
    private int transmissionId;

    @NotNull(message = "Vehicle type ID must be specified.")
    private int vehicleTypeId;

    @NotNull(message = "Mileage limit range ID must be specified.")
    private int mileageLimitRangeId;

    @NotNull(message = "Deposit fee range ID must be specified.")
    private int depositFeeRangeId;

    @NotNull(message = "Price range ID must be specified.")
    private int priceRangeId;
}
