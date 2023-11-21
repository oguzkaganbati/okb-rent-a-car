package com.tobeto.java1aintro.controllers;

import com.tobeto.java1aintro.entities.PriceRange;
import com.tobeto.java1aintro.repositories.PriceRangeRepository;
import org.hibernate.sql.Delete;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/price_ranges")
public class PriceRangeControllers {
    private final PriceRangeRepository priceRangeRepository;

    public PriceRangeControllers(PriceRangeRepository priceRangeRepository) {
        this.priceRangeRepository = priceRangeRepository;
    }

    @GetMapping
    public List<PriceRange> getAll(){
        return priceRangeRepository.findAll();
    }

    @GetMapping("{id}")
    public PriceRange findById(@PathVariable int id){
        return priceRangeRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody PriceRange priceRange){
        priceRangeRepository.save(priceRange);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        PriceRange priceRangeToDelete = priceRangeRepository.findById(id).orElseThrow();
    }
}
