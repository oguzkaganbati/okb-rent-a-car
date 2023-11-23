package com.tobeto.rentACar.repositories;

import com.tobeto.rentACar.entities.Fuel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelRepository extends JpaRepository<Fuel, Integer>
{
}
