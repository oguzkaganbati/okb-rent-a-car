package com.tobeto.java1aintro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "payment_types")
@Getter
@Setter
public class PaymentType
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "payment_type_name")
    private String paymentTypeName;

    @OneToMany(mappedBy = "paymentType")
    @JsonIgnore
    private List<Reservation> reservations;
}
