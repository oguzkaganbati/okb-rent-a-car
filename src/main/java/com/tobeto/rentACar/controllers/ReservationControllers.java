package com.tobeto.java1aintro.controllers;


import com.tobeto.java1aintro.entities.Reservation;
import com.tobeto.java1aintro.repositories.ReservationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/reservations")
public class ReservationControllers {
    private final ReservationRepository reservationRepository;

    public ReservationControllers(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping
    public List<Reservation> getAll(){
        return  reservationRepository.findAll();
    }

    @GetMapping("{id}")
    public Reservation getById(@PathVariable int id){
        return reservationRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Reservation reservation){
        reservationRepository.save(reservation);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        Reservation reservationToDelete = reservationRepository.findById(id).orElseThrow();
    }

}
