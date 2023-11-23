package com.tobeto.rentACar.services.abstracts;

import com.tobeto.rentACar.services.dtos.fuel.requests.AddFuelRequest;
import com.tobeto.rentACar.services.dtos.fuel.requests.DeleteFuelRequest;
import com.tobeto.rentACar.services.dtos.fuel.requests.UpdateFuelRequest;

public interface FuelService {
    void add(AddFuelRequest addFuelRequest);
    void delete(DeleteFuelRequest deleteFuelRequest);
    void update(UpdateFuelRequest updateFuelRequest);
}
