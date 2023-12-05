package com.tobeto.rentACar.services.concretes;

import com.tobeto.rentACar.entities.Transmission;
import com.tobeto.rentACar.repositories.TransmissionRepository;
import com.tobeto.rentACar.services.abstracts.TransmissionService;
import com.tobeto.rentACar.services.dtos.transmission.requests.AddTransmissionRequest;
import org.springframework.stereotype.Service;

@Service
public class TransmissionManager implements TransmissionService {
    private final TransmissionRepository transmissionRepository;

    public TransmissionManager(TransmissionRepository transmissionRepository) {
        this.transmissionRepository = transmissionRepository;
    }

    @Override
    public void add(AddTransmissionRequest addTransmissionRequest) {
        Transmission transmission = new Transmission();
        transmission.setTransmissionName(addTransmissionRequest.getTransmissionName());

    }

    @Override
    public Transmission getById(int id) {
        return transmissionRepository.findById(id).orElseThrow();
    }
}
