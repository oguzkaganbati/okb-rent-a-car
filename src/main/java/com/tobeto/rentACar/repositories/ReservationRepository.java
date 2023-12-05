package com.tobeto.rentACar.repositories;

import com.tobeto.rentACar.entities.Reservation;
import com.tobeto.rentACar.services.dtos.reservation.responses.GetListActiveReservationResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    @Query("SELECT new com.tobeto.rentACar.services.dtos.reservation.responses.GetListActiveReservationResponse(" +
            "r.id, c.firstName, c.lastName, m.modelName) " +
            "FROM Reservation r " +
            "JOIN r.customer c " +
            "JOIN r.vehicle v " +
            "JOIN v.model m " +
            "JOIN r.reservationStatus rs " +
            "WHERE rs.reservationStatusName = :statusName")
    List<GetListActiveReservationResponse> findReservationsByStatusName(@Param("statusName") String statusName);




}
