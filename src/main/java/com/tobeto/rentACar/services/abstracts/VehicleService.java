package com.tobeto.rentACar.services.abstracts;



import com.tobeto.rentACar.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.rentACar.services.dtos.vehicle.requests.AddVehicleRequest;

import com.tobeto.rentACar.services.dtos.vehicle.responses.GetVehicleListByFuelTypeResponse;

import java.util.List;

public interface VehicleService {


    void add(AddVehicleRequest addVehicleRequest);

    List<GetVehicleListByFuelTypeResponse> getByFuelName(String fuelName);
}


