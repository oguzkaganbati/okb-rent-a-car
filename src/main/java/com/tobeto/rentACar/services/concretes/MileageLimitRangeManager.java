package com.tobeto.rentACar.services.concretes;

import com.tobeto.rentACar.entities.MileageLimitRange;
import com.tobeto.rentACar.repositories.MileageLimitRangeRepository;
import com.tobeto.rentACar.services.abstracts.MileageLimitRangeService;
import com.tobeto.rentACar.services.dtos.mileage_limit_range.requests.AddMileageLimitRangeRequest;
import org.springframework.stereotype.Service;

@Service
public class MileageLimitRangeManager implements MileageLimitRangeService {

    private final MileageLimitRangeRepository mileageLimitRangeRepository;

    public MileageLimitRangeManager(MileageLimitRangeRepository mileageLimitRangeRepository) {
        this.mileageLimitRangeRepository = mileageLimitRangeRepository;
    }

    @Override
    public void add(AddMileageLimitRangeRequest addMileageLimitRangeRequest) {
        MileageLimitRange mileageLimitRange = new MileageLimitRange();
        mileageLimitRange.setMileageLimitRange(addMileageLimitRangeRequest.getMileAgeLimitName());

    }

    @Override
    public MileageLimitRange getById(int id) {
        return mileageLimitRangeRepository.findById(id).orElseThrow();
    }
}
