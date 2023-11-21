package com.tobeto.java1aintro.repositories;

import com.tobeto.java1aintro.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

//Generic
// Generic type'lar Reference Type olarak belirtilmelidir.
public interface BrandRepository extends JpaRepository<Brand, Integer>
{

}
