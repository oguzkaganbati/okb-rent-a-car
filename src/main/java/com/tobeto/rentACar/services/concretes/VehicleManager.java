package com.tobeto.rentACar.services.concretes;

import com.tobeto.rentACar.repositories.VehicleRepository;
import com.tobeto.rentACar.services.abstracts.VehicleService;
import com.tobeto.rentACar.services.dtos.vehicle.responses.GetVehicleListByFuelTypeResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleManager implements VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleManager(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }


    @Override
    public List<GetVehicleListByFuelTypeResponse> getByFuelNameDto(String fuelName) {
        return vehicleRepository.findByFuelName(fuelName);
    }
}
