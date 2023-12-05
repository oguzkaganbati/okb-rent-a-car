package com.tobeto.rentACar.services.abstracts;


import com.tobeto.rentACar.services.dtos.reservation.responses.GetListActiveReservationResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface ReservationService {

    List<GetListActiveReservationResponse> getByActiveReservationDto(String statusName);

}
