package com.tobeto.rentACar.services.abstracts;

import com.tobeto.rentACar.entities.Model;
import com.tobeto.rentACar.services.dtos.model.requests.AddModelRequest;

public interface ModelService {
    void add(AddModelRequest addModelRequest);

    Model getById(int id);
}
