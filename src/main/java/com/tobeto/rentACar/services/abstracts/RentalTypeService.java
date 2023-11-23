package com.tobeto.rentACar.services.abstracts;

import com.tobeto.rentACar.services.dtos.rental_type.requests.AddRentalTypeRequest;

public interface RentalTypeService {
    void add(AddRentalTypeRequest addRentalTypeRequest);
}
