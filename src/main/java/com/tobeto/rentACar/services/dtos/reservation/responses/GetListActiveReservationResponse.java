package com.tobeto.rentACar.services.dtos.reservation.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListActiveReservationResponse {
    private int id;
    private String firstName;
    private String lastName;
    private String modelName;
}
