package com.tobeto.rentACar.services.dtos.reservation.requests;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AddReservationRequest {
    private Boolean additionalDriver;
    private LocalDateTime pickupDate;
    private LocalDateTime dropoffDate;


}
