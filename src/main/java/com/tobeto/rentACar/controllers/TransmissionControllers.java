package com.tobeto.rentACar.controllers;


import com.tobeto.rentACar.services.abstracts.TransmissionService;
import com.tobeto.rentACar.services.dtos.transmission.requests.AddTransmissionRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/transmissions")
public class TransmissionControllers {
    private TransmissionService transmissionService;

    public TransmissionControllers(TransmissionService transmissionService) {
        this.transmissionService = transmissionService;
    }

    @PostMapping
    public void add(@RequestBody @Valid AddTransmissionRequest addTransmissionRequest){
        transmissionService.add(addTransmissionRequest);
    }
}
