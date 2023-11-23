package com.tobeto.rentACar.services.abstracts;

import com.tobeto.rentACar.services.dtos.fuel.requests.UpdateFuelRequest;
import com.tobeto.rentACar.services.dtos.location.requests.AddLocationRequest;
import com.tobeto.rentACar.services.dtos.location.requests.DeleteLocationRequest;
import com.tobeto.rentACar.services.dtos.location.requests.UpdateLocationRequest;

public interface LocationService {
    void add(AddLocationRequest addLocationRequest);
    void delete(DeleteLocationRequest deleteLocationRequest);
    void update(UpdateLocationRequest updateLocationRequest);
}
