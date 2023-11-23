package com.tobeto.rentACar.services.concretes;

import com.tobeto.rentACar.entities.Time;
import com.tobeto.rentACar.repositories.TimeRepository;
import com.tobeto.rentACar.services.abstracts.TimeService;
import com.tobeto.rentACar.services.dtos.time.requests.AddTimeRequest;
import org.springframework.stereotype.Service;

@Service
public class TimeManager implements TimeService {

    private final TimeRepository timeRepository;

    public TimeManager(TimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }

    @Override
    public void add(AddTimeRequest addTimeRequest) {
        Time time = new Time();
        time.setTime(addTimeRequest.getTimeName());

    }
}
