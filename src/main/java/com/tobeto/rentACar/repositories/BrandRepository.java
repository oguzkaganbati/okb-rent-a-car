package com.tobeto.rentACar.repositories;

import com.tobeto.rentACar.entities.Brand;
import com.tobeto.rentACar.services.dtos.brand.responses.GetAllBrandResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Generic
// Generic type'lar Reference Type olarak belirtilmelidir.
public interface BrandRepository extends JpaRepository<Brand, Integer>
{
    @Query("SELECT new com.tobeto.rentACar.services.dtos.brand.responses.GetAllBrandResponse(b.id, b.brandName) FROM Brand b WHERE b.brandName= :brandName")
    List<GetAllBrandResponse> findByName(String brandName);
}
