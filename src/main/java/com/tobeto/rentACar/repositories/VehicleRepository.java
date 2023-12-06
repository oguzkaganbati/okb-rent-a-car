package com.tobeto.rentACar.repositories;

import com.tobeto.rentACar.entities.Vehicle;
import com.tobeto.rentACar.services.dtos.vehicle.responses.GetVehicleListByFuelTypeResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

    @Query("SELECT new com.tobeto.rentACar.services.dtos.vehicle.responses.GetVehicleListByFuelTypeResponse(v.id, b.brandName, m.modelName)" +
            "FROM Vehicle v " +
            "JOIN v.brand b " +
            "JOIN v.model m " +
            "JOIN v.fuel f " +
            "WHERE f.fuelName = :fuelName")
    List<GetVehicleListByFuelTypeResponse> findByFuelName(@Param("fuelName") String fuelName);


    boolean existsCarByPlate(String plate);}
