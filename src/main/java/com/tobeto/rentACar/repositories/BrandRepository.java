package com.tobeto.rentACar.repositories;

import com.tobeto.rentACar.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

//Generic
// Generic type'lar Reference Type olarak belirtilmelidir.
public interface BrandRepository extends JpaRepository<Brand, Integer>
{

}
