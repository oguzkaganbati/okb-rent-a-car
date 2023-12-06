package com.tobeto.rentACar.services.concretes;

import com.tobeto.rentACar.entities.Brand;
import com.tobeto.rentACar.repositories.BrandRepository;
import com.tobeto.rentACar.services.abstracts.BrandService;
import com.tobeto.rentACar.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.rentACar.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.rentACar.services.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.rentACar.services.dtos.brand.responses.GetListBrandResponse;

import org.springframework.dao.DataIntegrityViolationException;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {
    private final BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void add(AddBrandRequest request) {
        if (brandRepository.existsByBrandName(request.getBrandName())) {
            throw new DataIntegrityViolationException("Brand with the same name already exists.");
        }

        Brand brand = new Brand();
        brand.setBrandName(request.getBrandName());
        brandRepository.save(brand);
    }

    @Override
    public void delete(DeleteBrandRequest deleteBrandRequest){
        Brand brandToDelete = brandRepository.findById(deleteBrandRequest.getBrandId()).orElseThrow();
        brandRepository.delete(brandToDelete);
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brandToUpdate = brandRepository.findById(updateBrandRequest.getBrandId()).orElseThrow();
        brandToUpdate.setBrandName(brandToUpdate.getBrandName());
        brandRepository.saveAndFlush(brandToUpdate);
    }

    @Override
    public List<Brand> getByBrandName(String brandName) {
        return brandRepository.findByBrandNameStartingWith(brandName);
    }

    @Override
    public List<GetListBrandResponse> getByBrandNameDto(String brandName) {
        return brandRepository.findByBrandNameStartingWith(brandName).stream().map(brand -> {
        return new GetListBrandResponse(brand.getId(), brand.getBrandName());
        }).toList();

    }

    @Override
    public Brand getById(int id) {
        return brandRepository.findById(id).orElseThrow();

    }


}
