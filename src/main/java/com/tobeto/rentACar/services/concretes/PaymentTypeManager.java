package com.tobeto.rentACar.services.concretes;

import com.tobeto.rentACar.entities.PaymentType;
import com.tobeto.rentACar.repositories.PaymentTypeRepository;
import com.tobeto.rentACar.services.abstracts.PaymentTypeService;
import com.tobeto.rentACar.services.dtos.payment_type.requests.AddPaymentTypeRequest;
import org.springframework.stereotype.Service;

@Service
public class PaymentTypeManager implements PaymentTypeService {

    private final PaymentTypeRepository paymentTypeRepository;

    public PaymentTypeManager(PaymentTypeRepository paymentTypeRepository) {
        this.paymentTypeRepository = paymentTypeRepository;
    }

    @Override
    public void add(AddPaymentTypeRequest addPaymentTypeRequest) {
        PaymentType paymentType = new PaymentType();
        paymentType.setPaymentTypeName(addPaymentTypeRequest.getPaymentTypeName());

    }
}
