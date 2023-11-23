package com.tobeto.rentACar.services.concretes;

import com.tobeto.rentACar.entities.Location;
import com.tobeto.rentACar.repositories.LocationRepository;
import com.tobeto.rentACar.services.abstracts.LocationService;
import com.tobeto.rentACar.services.dtos.fuel.requests.UpdateFuelRequest;
import com.tobeto.rentACar.services.dtos.location.requests.AddLocationRequest;
import com.tobeto.rentACar.services.dtos.location.requests.DeleteLocationRequest;
import com.tobeto.rentACar.services.dtos.location.requests.UpdateLocationRequest;
import org.springframework.stereotype.Service;

@Service
public class LocationManager implements LocationService {

    private final LocationRepository locationRepository;

    public LocationManager(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public void add(AddLocationRequest addLocationRequest) {
        Location location = new Location();
        location.setLocationName(addLocationRequest.getLocationName());

    }

    @Override
    public void delete(DeleteLocationRequest deleteLocationRequest) {
        Location locationToDelete = locationRepository.findById(deleteLocationRequest.getLocationId()).orElseThrow();
        locationRepository.delete(locationToDelete);
    }

    @Override
    public void update(UpdateLocationRequest updateLocationRequest) {
        Location locationToUpdate = locationRepository.findById(updateLocationRequest.getLocationId()).orElseThrow();
        locationToUpdate.setLocationName(updateLocationRequest.getLocationName());

        locationRepository.saveAndFlush(locationToUpdate);
    }

}

