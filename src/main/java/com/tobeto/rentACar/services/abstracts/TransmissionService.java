package com.tobeto.rentACar.services.abstracts;

import com.tobeto.rentACar.entities.Transmission;
import com.tobeto.rentACar.services.dtos.transmission.requests.AddTransmissionRequest;

public interface TransmissionService {
    void add(AddTransmissionRequest addTransmissionRequest);

    Transmission getById(int id);
}
