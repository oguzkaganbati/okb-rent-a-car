package com.tobeto.rentACar.services.abstracts;

import com.tobeto.rentACar.services.dtos.mileage_limit_range.requests.AddMileageLimitRangeRequest;

public interface MileageLimitRangeService {
    void add(AddMileageLimitRangeRequest addMileageLimitRangeRequest);
}
