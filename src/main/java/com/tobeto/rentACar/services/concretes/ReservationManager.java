package com.tobeto.rentACar.services.concretes;

import com.tobeto.rentACar.entities.Brand;
import com.tobeto.rentACar.entities.Reservation;
import com.tobeto.rentACar.repositories.ReservationRepository;
import com.tobeto.rentACar.services.abstracts.ReservationService;
import com.tobeto.rentACar.services.dtos.reservation.requests.AddReservationRequest;
import com.tobeto.rentACar.services.dtos.reservation.responses.FindActiveReservationResponse;

import java.util.List;

public class ReservationManager implements ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationManager(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public void add(AddReservationRequest request) {
        Reservation reservation = new Reservation();
        reservation.setId(request.getId());
        reservationRepository.save(reservation);
    }

    @Override
    public List<FindActiveReservationResponse> getByIdDto(Integer status_id) {
        return null;
    }
}
