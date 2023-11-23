package com.tobeto.rentACar.services.abstracts;

import com.tobeto.rentACar.services.dtos.vehicle_type.requests.AddVehicleTypeRequest;

public interface VehicleTypeService {
    void add(AddVehicleTypeRequest addVehicleTypeRequest);
}
