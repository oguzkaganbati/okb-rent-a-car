package com.tobeto.rentACar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "mileage_limit_ranges")
@Getter
@Setter
public class MileageLimitRange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "mileage_limit_range")
    private String mileageLimitRange;

    @OneToMany(mappedBy = "mileageLimitRange")
    @JsonIgnore
    private List<Vehicle> vehicles;

}
