package com.tobeto.rentACar.services.concretes;

import com.tobeto.rentACar.entities.VehicleType;
import com.tobeto.rentACar.repositories.VehicleTypeRepository;
import com.tobeto.rentACar.services.abstracts.VehicleTypeService;
import com.tobeto.rentACar.services.dtos.vehicle_type.requests.AddVehicleTypeRequest;
import org.springframework.stereotype.Service;

@Service
public class VehicleTypeManager implements VehicleTypeService {

    private final VehicleTypeRepository vehicleTypeRepository;

    public VehicleTypeManager(VehicleTypeRepository vehicleTypeRepository) {
        this.vehicleTypeRepository = vehicleTypeRepository;
    }

    @Override
    public void add(AddVehicleTypeRequest addVehicleTypeRequest) {
        VehicleType vehicleType = new VehicleType();
        vehicleType.setVehicleTypeName(addVehicleTypeRequest.getVehicleTypeName());

    }

    @Override
    public VehicleType getById(int id) {
        return vehicleTypeRepository.findById(id).orElseThrow();
    }
}
