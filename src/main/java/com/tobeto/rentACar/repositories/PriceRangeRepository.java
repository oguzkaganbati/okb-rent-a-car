package com.tobeto.java1aintro.repositories;

import com.tobeto.java1aintro.entities.PriceRange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRangeRepository extends JpaRepository<PriceRange, Integer>
{
}
