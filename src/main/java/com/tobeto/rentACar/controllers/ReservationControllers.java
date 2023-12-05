package com.tobeto.rentACar.controllers;



import com.tobeto.rentACar.services.abstracts.ReservationService;
import com.tobeto.rentACar.services.dtos.reservation.responses.GetListActiveReservationResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/reservations")
public class ReservationControllers {
    private ReservationService reservationService;

    public ReservationControllers(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/dto/byActiveReservation")
    List<GetListActiveReservationResponse> getByActiveReservationDto(@RequestParam @Valid String statusName){
        return reservationService.getByActiveReservationDto(statusName);
    }


}
