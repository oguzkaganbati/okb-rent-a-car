package com.tobeto.rentACar.services.concretes;

import com.tobeto.rentACar.entities.PriceRange;
import com.tobeto.rentACar.repositories.PriceRangeRepository;
import com.tobeto.rentACar.services.abstracts.PriceRangeService;
import com.tobeto.rentACar.services.dtos.price_range.requests.AddPriceRangeRequest;
import org.springframework.stereotype.Service;

@Service
public class PriceRangeManager implements PriceRangeService {

    private final PriceRangeRepository priceRangeRepository;

    public PriceRangeManager(PriceRangeRepository priceRangeRepository) {
        this.priceRangeRepository = priceRangeRepository;
    }

    @Override
    public void add(AddPriceRangeRequest addPriceRangeRequest) {
        PriceRange priceRange= new PriceRange();
        priceRange.setPriceRange(addPriceRangeRequest.getPriceRangeName());

    }

    @Override
    public PriceRange getById(int id) {
        return priceRangeRepository.findById(id).orElseThrow();
    }
}
