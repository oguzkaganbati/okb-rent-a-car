package com.tobeto.rentACar.repositories;

import com.tobeto.rentACar.entities.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer>
{
}
