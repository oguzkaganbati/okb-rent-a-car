package com.tobeto.java1aintro.repositories;

import com.tobeto.java1aintro.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
