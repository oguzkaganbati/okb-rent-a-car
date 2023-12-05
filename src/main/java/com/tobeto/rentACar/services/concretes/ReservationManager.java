package com.tobeto.rentACar.services.concretes;

import com.tobeto.rentACar.repositories.ReservationRepository;
import com.tobeto.rentACar.services.abstracts.ReservationService;
import com.tobeto.rentACar.services.dtos.reservation.responses.GetListActiveReservationResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReservationManager implements ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationManager(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }


    @Override
    public List<GetListActiveReservationResponse> getByActiveReservationDto(String statusName) {
        return reservationRepository.findReservationsByStatusName(statusName);
    }
}
