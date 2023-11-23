package com.tobeto.rentACar.services.abstracts;

import com.tobeto.rentACar.services.dtos.transmission.requests.AddTransmissionRequest;

public interface TransmissionService {
    void add(AddTransmissionRequest addTransmissionRequest);
}
