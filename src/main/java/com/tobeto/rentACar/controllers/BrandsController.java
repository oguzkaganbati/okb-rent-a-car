package com.tobeto.rentACar.controllers;

import com.tobeto.rentACar.entities.Brand;
import com.tobeto.rentACar.services.abstracts.BrandService;
import com.tobeto.rentACar.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.rentACar.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.rentACar.services.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.rentACar.services.dtos.brand.responses.GetListBrandResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/brands")
public class BrandsController {// directing and controlling the request
    private BrandService brandService;

    public BrandsController(BrandService brandService)
    {
        this.brandService = brandService;
    }


    @GetMapping("/dto")
    public List<GetListBrandResponse> getBrandByDto(@Valid @RequestParam String brandName){
        return brandService.getByBrandNameDto(brandName);
    }


    @GetMapping
    public List<Brand> getBrandByName(@Valid @RequestParam String brandName){
        return brandService.getByBrandName(brandName);
    }

    @PostMapping
    public void add(@RequestBody @Valid AddBrandRequest request)
    {
        brandService.add(request);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody @Valid DeleteBrandRequest deleteBrandRequest)
    {
        brandService.delete(deleteBrandRequest);

    }

    @PutMapping("/update")
    public void update(@RequestBody @Valid UpdateBrandRequest updateBrandRequest){
        brandService.update(updateBrandRequest);
    }


}
