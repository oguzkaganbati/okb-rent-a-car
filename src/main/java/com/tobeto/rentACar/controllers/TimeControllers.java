package com.tobeto.java1aintro.controllers;

import com.tobeto.java1aintro.entities.Time;
import com.tobeto.java1aintro.repositories.TimeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/times")
public class TimeControllers {
    private final TimeRepository timeRepository;

    public TimeControllers(TimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }

    @GetMapping
    public List<Time> getAll(){
        return timeRepository.findAll();
    }

    @GetMapping("{id}")
    public Time getById(@PathVariable int id){
        return timeRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Time time){
        timeRepository.save(time);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        Time timeToDelete = timeRepository.findById(id).orElseThrow();
    }
}
