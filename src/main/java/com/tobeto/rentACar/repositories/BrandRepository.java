package com.tobeto.rentACar.repositories;

import com.tobeto.rentACar.entities.Brand;
import com.tobeto.rentACar.services.dtos.brand.responses.GetListBrandResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Generic
// Generic type'lar Reference Type olarak belirtilmelidir.
public interface BrandRepository extends JpaRepository<Brand, Integer>
{
    List<Brand> findByBrandNameStartingWith(String brandName);

    //@Query("Select new com.tobeto.rentACar.services.dtos.brand.responses.GetListBrandResponse(b.id, b.brandName) " +
        //    "FROM Brand b WHERE b.brandName= :brandName")
    //List<GetListBrandResponse> findByName(String brandName);

    boolean existsByBrandName(String brandName);
}
