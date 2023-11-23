package com.tobeto.rentACar.repositories;

import com.tobeto.rentACar.entities.MileageLimitRange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MileageLimitRangeRepository extends JpaRepository<MileageLimitRange, Integer>
{
}
