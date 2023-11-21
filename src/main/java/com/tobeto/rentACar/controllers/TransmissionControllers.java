package com.tobeto.java1aintro.controllers;

import com.tobeto.java1aintro.entities.Transmission;
import com.tobeto.java1aintro.repositories.TransmissionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TransferQueue;

@RestController
@RequestMapping("api/transmissions")
public class TransmissionControllers {
    private final TransmissionRepository transmissionRepository;

    public TransmissionControllers(TransmissionRepository transmissionRepository) {
        this.transmissionRepository = transmissionRepository;
    }

    @GetMapping
    public List<Transmission> getAll(){
        return transmissionRepository.findAll();
    }

    @GetMapping("{id}")
    public Transmission getById(@PathVariable int id){
      return  transmissionRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Transmission transmission){
        transmissionRepository.save(transmission);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        Transmission transmissionToDelete = transmissionRepository.findById(id).orElseThrow();
    }
}
