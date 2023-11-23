package com.tobeto.rentACar.services.concretes;

import com.tobeto.rentACar.entities.Fuel;
import com.tobeto.rentACar.repositories.FuelRepository;
import com.tobeto.rentACar.services.abstracts.FuelService;
import com.tobeto.rentACar.services.dtos.fuel.requests.AddFuelRequest;
import com.tobeto.rentACar.services.dtos.fuel.requests.DeleteFuelRequest;
import com.tobeto.rentACar.services.dtos.fuel.requests.UpdateFuelRequest;
import org.hibernate.sql.Delete;
import org.springframework.stereotype.Service;

@Service
public class FuelManager implements FuelService {

    private final FuelRepository fuelRepository;

    public FuelManager(FuelRepository fuelRepository) {
        this.fuelRepository = fuelRepository;
    }

    @Override
    public void add(AddFuelRequest addFuelRequest) {
        Fuel fuel = new Fuel();
        fuel.setFuelName(addFuelRequest.getFuelName());

    }

    @Override
    public void delete(DeleteFuelRequest deleteFuelRequest) {
        Fuel fuelToDelete = fuelRepository.findById(deleteFuelRequest.getFuelId()).orElseThrow();
        fuelRepository.delete(fuelToDelete);
    }

    @Override
    public void update(UpdateFuelRequest updateFuelRequest) {
        Fuel fuelToUpdate = fuelRepository.findById(updateFuelRequest.getFuelId()).orElseThrow();
        fuelToUpdate.setFuelName(updateFuelRequest.getFuelName());
    }
}
