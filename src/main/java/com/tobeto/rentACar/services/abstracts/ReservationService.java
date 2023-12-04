package com.tobeto.rentACar.services.abstracts;

import com.tobeto.rentACar.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.rentACar.services.dtos.reservation.requests.AddReservationRequest;
import com.tobeto.rentACar.services.dtos.reservation.responses.FindActiveReservationResponse;

import java.util.List;

public interface ReservationService {
    void add(AddReservationRequest request);
    List<FindActiveReservationResponse> getByIdDto(Integer status_id);
}
