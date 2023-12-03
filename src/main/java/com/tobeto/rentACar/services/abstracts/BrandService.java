package com.tobeto.rentACar.services.abstracts;

import com.tobeto.rentACar.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.rentACar.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.rentACar.services.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.rentACar.services.dtos.brand.responses.GetAllBrandResponse;

import java.util.List;


public interface BrandService {
    void add(AddBrandRequest request);
    void delete(DeleteBrandRequest deleteBrandRequest);
    void update(UpdateBrandRequest updateBrandRequest);
    List<GetAllBrandResponse> getByNameDto(String brandName);

}
