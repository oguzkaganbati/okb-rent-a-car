package com.tobeto.rentACar.services.abstracts;

import com.tobeto.rentACar.services.dtos.price_range.requests.AddPriceRangeRequest;

public interface PriceRangeService {
    void add(AddPriceRangeRequest addPriceRangeRequest);
}
