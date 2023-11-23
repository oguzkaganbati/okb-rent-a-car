package com.tobeto.rentACar.controllers;


import com.tobeto.rentACar.services.abstracts.TimeService;
import com.tobeto.rentACar.services.dtos.time.requests.AddTimeRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/times")
public class TimeControllers {
    private TimeService timeService;

    public TimeControllers(TimeService timeService) {
        this.timeService = timeService;
    }

    @PostMapping
    public void add(AddTimeRequest addTimeRequest){
        timeService.add(addTimeRequest);
    }
}
