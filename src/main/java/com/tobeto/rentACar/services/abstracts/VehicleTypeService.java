package com.tobeto.rentACar.services.abstracts;

import com.tobeto.rentACar.entities.Vehicle;
import com.tobeto.rentACar.entities.VehicleType;
import com.tobeto.rentACar.services.dtos.vehicle_type.requests.AddVehicleTypeRequest;

public interface VehicleTypeService {
    void add(AddVehicleTypeRequest addVehicleTypeRequest);

    VehicleType getById(int id);
}
