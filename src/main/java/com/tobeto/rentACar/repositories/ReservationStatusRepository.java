package com.tobeto.rentACar.repositories;

import com.tobeto.rentACar.entities.ReservationStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationStatusRepository  extends JpaRepository<ReservationStatus, Integer > {
}
