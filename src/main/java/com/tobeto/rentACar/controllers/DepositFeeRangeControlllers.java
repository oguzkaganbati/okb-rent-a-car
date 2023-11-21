package com.tobeto.java1aintro.controllers;

import com.tobeto.java1aintro.entities.DepositFeeRange;
import com.tobeto.java1aintro.repositories.DepositFeeRangeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/deposit_fee_ranges")
public class DepositFeeRangeControlllers
{
    private final DepositFeeRangeRepository depositFeeRangeRepository;

    public DepositFeeRangeControlllers(DepositFeeRangeRepository depositFeeRangeRepository) {
        this.depositFeeRangeRepository = depositFeeRangeRepository;
    }

    @GetMapping
    public List<DepositFeeRange> getAll(){
        return depositFeeRangeRepository.findAll();
    }

    @GetMapping("{id}")
    public DepositFeeRange getByID(@PathVariable int id){
        return depositFeeRangeRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody DepositFeeRange depositFeeRange){
        depositFeeRangeRepository.save(depositFeeRange);
    }

    @DeleteMapping
    public void delete(@PathVariable int id){
        DepositFeeRange depositFeeRangeToDelete = depositFeeRangeRepository.findById(id).orElseThrow();
    }

}
