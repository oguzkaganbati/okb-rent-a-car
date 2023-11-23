package com.tobeto.rentACar.services.concretes;

import com.tobeto.rentACar.entities.RentalType;
import com.tobeto.rentACar.repositories.RentalTypeRepository;
import com.tobeto.rentACar.services.abstracts.RentalTypeService;
import com.tobeto.rentACar.services.dtos.rental_type.requests.AddRentalTypeRequest;
import org.springframework.stereotype.Service;

@Service
public class RentalTypeManager implements RentalTypeService {

    private final RentalTypeRepository rentalTypeRepository;

    public RentalTypeManager(RentalTypeRepository rentalTypeRepository) {
        this.rentalTypeRepository = rentalTypeRepository;
    }

    @Override
    public void add(AddRentalTypeRequest addRentalTypeRequest) {
        RentalType rentalType = new RentalType();
        rentalType.setRentalTypeName(addRentalTypeRequest.getRentalTypeName());

    }
}
