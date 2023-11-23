package com.tobeto.rentACar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "price_ranges")
@Getter
@Setter
public class PriceRange {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "price_range")
    private String priceRange;

    @OneToMany(mappedBy = "priceRange")
    @JsonIgnore
    private List<Vehicle> vehicles;
}
