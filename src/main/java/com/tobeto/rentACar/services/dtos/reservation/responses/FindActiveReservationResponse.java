package com.tobeto.rentACar.services.dtos.reservation.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindActiveReservationResponse
{
    private int id;
    private int status_id;
}
