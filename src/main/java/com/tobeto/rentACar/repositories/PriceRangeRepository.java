package com.tobeto.rentACar.repositories;

import com.tobeto.rentACar.entities.PriceRange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRangeRepository extends JpaRepository<PriceRange, Integer>
{
}
