package com.tobeto.rentACar.controllers;


import com.tobeto.rentACar.services.abstracts.MileageLimitRangeService;
import com.tobeto.rentACar.services.dtos.mileage_limit_range.requests.AddMileageLimitRangeRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/mileage_limit_range")
public class MileageLimitRangeControllers {
    private MileageLimitRangeService mileageLimitRangeService;

    public MileageLimitRangeControllers(MileageLimitRangeService mileageLimitRangeService) {
        this.mileageLimitRangeService = mileageLimitRangeService;
    }

    @PostMapping
    public void add(@RequestBody @Valid AddMileageLimitRangeRequest addMileageLimitRangeRequest){
        mileageLimitRangeService.add(addMileageLimitRangeRequest);
    }
}
