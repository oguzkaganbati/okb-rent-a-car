package com.tobeto.rentACar.services.abstracts;

import com.tobeto.rentACar.entities.Brand;
import com.tobeto.rentACar.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.rentACar.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.rentACar.services.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.rentACar.services.dtos.brand.responses.GetListBrandResponse;

import java.util.List;


public interface BrandService {
    void add(AddBrandRequest request);
    void delete(DeleteBrandRequest deleteBrandRequest);
    void update(UpdateBrandRequest updateBrandRequest);

    List<Brand> getByBrandName(String brandName);
    List<GetListBrandResponse> getByBrandNameDto(String brandName);

    Brand getById(int id);


}
