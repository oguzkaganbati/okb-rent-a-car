package com.tobeto.java1aintro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "transmissions")
@Getter
@Setter
public class Transmission
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "transmission_name")
    private String transmissionName;

    @OneToMany(mappedBy = "transmission")
    @JsonIgnore
    private List<Vehicle> vehicles;

}
