package com.tobeto.rentACar.controllers;

import com.tobeto.rentACar.services.abstracts.BrandService;
import com.tobeto.rentACar.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.rentACar.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.rentACar.services.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.rentACar.services.dtos.brand.responses.GetAllBrandResponse;
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

    @GetMapping("dto")
    public List<GetAllBrandResponse> getByNameDto(@RequestParam String brandName){
        return brandService.getByNameDto(brandName);
    }

    @PostMapping
    public void add(@RequestBody AddBrandRequest request)
    {
        brandService.add(request);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody DeleteBrandRequest deleteBrandRequest)
    {
        brandService.delete(deleteBrandRequest);

    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateBrandRequest updateBrandRequest){
        brandService.update(updateBrandRequest);
    }


}
