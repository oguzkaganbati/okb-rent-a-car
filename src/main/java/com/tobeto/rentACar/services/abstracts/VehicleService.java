package com.tobeto.rentACar.services.abstracts;


import com.tobeto.rentACar.services.dtos.vehicle.responses.GetVehicleListByFuelTypeResponse;

import java.util.List;

public interface VehicleService {

    List<GetVehicleListByFuelTypeResponse> getByFuelNameDto(String fuelName);

}
