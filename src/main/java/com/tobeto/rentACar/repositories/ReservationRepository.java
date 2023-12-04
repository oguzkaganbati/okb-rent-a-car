package com.tobeto.rentACar.repositories;

import com.tobeto.rentACar.entities.Reservation;
import com.tobeto.rentACar.services.dtos.reservation.responses.FindActiveReservationResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    @Query("SELECT new com.tobeto.rentACar.services.dtos.reservation.responses.FindActiveReservationResponse(r.reservationStatus.id, r.id)" +
            "FROM Reservation r WHERE r.reservationStatus.id = :statusId")
    List<FindActiveReservationResponse> findReservationsByStatusId(@Param("statusId") Integer statusId);


    //@Query("SELECT new com.example.dto.ReservationDTO(r.id, r.date, r.additionalDriver, r.pickupDate, r.dropoffDate, r.status.id) FROM Reservation r WHERE r.pickupDate BETWEEN :start AND :end")
    //List<ReservationDTO> findReservationsInDateRange(@Param("start") Date start, @Param("end") Date end);
}
