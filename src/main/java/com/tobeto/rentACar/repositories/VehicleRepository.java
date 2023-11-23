package com.tobeto.rentACar.repositories;

import com.tobeto.rentACar.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
