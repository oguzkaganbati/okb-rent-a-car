package com.tobeto.rentACar.controllers;


import com.tobeto.rentACar.services.abstracts.PaymentTypeService;
import com.tobeto.rentACar.services.dtos.payment_type.requests.AddPaymentTypeRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/payment_types")
public class PaymentTypeControllers {
    private PaymentTypeService paymentTypeService;

    public PaymentTypeControllers(PaymentTypeService paymentTypeService) {
        this.paymentTypeService = paymentTypeService;
    }

    @PostMapping
    public void add(@RequestBody @Valid AddPaymentTypeRequest addPaymentTypeRequest){
        paymentTypeService.add(addPaymentTypeRequest);
    }
}
