package com.tobeto.rentACar.controllers;


import com.tobeto.rentACar.services.abstracts.PriceRangeService;
import com.tobeto.rentACar.services.dtos.price_range.requests.AddPriceRangeRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/price_ranges")
public class PriceRangeControllers {
    private PriceRangeService priceRangeService;

    public PriceRangeControllers(PriceRangeService priceRangeService) {
        this.priceRangeService = priceRangeService;
    }

    @PostMapping
    public void add(@RequestBody @Valid AddPriceRangeRequest addPriceRangeRequest){
        priceRangeService.add(addPriceRangeRequest);
    }
}
