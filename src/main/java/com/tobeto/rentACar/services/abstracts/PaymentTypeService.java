package com.tobeto.rentACar.services.abstracts;

import com.tobeto.rentACar.services.dtos.payment_type.requests.AddPaymentTypeRequest;

public interface PaymentTypeService {
    void add(AddPaymentTypeRequest addPaymentTypeRequest);
}
