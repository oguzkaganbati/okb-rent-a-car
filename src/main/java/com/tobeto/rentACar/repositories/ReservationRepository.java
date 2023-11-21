package com.tobeto.java1aintro.repositories;

import com.tobeto.java1aintro.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>
{
}
