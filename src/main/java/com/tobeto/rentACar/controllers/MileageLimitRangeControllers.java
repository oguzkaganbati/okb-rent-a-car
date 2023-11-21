package com.tobeto.java1aintro.controllers;

import com.tobeto.java1aintro.entities.MileageLimitRange;
import com.tobeto.java1aintro.repositories.MileageLimitRangeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/mileage_limit_range")
public class MileageLimitRangeControllers {
    private final MileageLimitRangeRepository mileageLimitRangeRepository;

    public MileageLimitRangeControllers(MileageLimitRangeRepository mileageLimitRangeRepository) {
        this.mileageLimitRangeRepository = mileageLimitRangeRepository;
    }

    @GetMapping
    public List<MileageLimitRange> getAll(){
        return mileageLimitRangeRepository.findAll();
    }

    @GetMapping("{id}")
    public MileageLimitRange getById(@PathVariable int id){
        return mileageLimitRangeRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody MileageLimitRange mileageLimitRange){
        mileageLimitRangeRepository.save(mileageLimitRange);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        MileageLimitRange mileageLimitRangeToDelete = mileageLimitRangeRepository.findById(id).orElseThrow();
    }
}
