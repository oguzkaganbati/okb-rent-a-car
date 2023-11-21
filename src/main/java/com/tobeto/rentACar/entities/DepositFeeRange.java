package com.tobeto.java1aintro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "deposit_fee_ranges")
@Getter
@Setter
public class DepositFeeRange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "deposit_fee_range")
    private String depositFeeRange;

    @OneToMany(mappedBy = "depositFeeRange")
    @JsonIgnore
    private List<Vehicle> vehicles;


}
