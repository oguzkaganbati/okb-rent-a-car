package com.tobeto.rentACar.repositories;

import com.tobeto.rentACar.entities.RentalType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalTypeRepository extends JpaRepository<RentalType, Integer>
{
}
