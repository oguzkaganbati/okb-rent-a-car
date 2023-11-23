package com.tobeto.rentACar.services.abstracts;

import com.tobeto.rentACar.services.dtos.time.requests.AddTimeRequest;

public interface TimeService {
    void add(AddTimeRequest addTimeRequest);
}
