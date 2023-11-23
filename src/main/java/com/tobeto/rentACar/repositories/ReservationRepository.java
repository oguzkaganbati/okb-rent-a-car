package com.tobeto.rentACar.repositories;

import com.tobeto.rentACar.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>
{
}
