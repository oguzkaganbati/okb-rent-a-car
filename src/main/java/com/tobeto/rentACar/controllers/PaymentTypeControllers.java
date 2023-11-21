package com.tobeto.java1aintro.controllers;

import com.tobeto.java1aintro.entities.PaymentType;
import com.tobeto.java1aintro.repositories.PaymentTypeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/payment_types")
public class PaymentTypeControllers {
    private final PaymentTypeRepository paymentTypeRepository;

    public PaymentTypeControllers(PaymentTypeRepository paymentTypeRepository) {
        this.paymentTypeRepository = paymentTypeRepository;
    }

    @GetMapping
    public List<PaymentType> getAll(){
        return paymentTypeRepository.findAll();
    }

    @GetMapping("{id}")
    public PaymentType getById(@PathVariable int id){
        return paymentTypeRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody PaymentType paymentType){
        paymentTypeRepository.save(paymentType);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        PaymentType paymentTypeToDelete = paymentTypeRepository.findById(id).orElseThrow();
    }
}
