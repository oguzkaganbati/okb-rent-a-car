package com.tobeto.rentACar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "times")
@Getter
@Setter
public class Time
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "time")
    private String time;

    @OneToMany(mappedBy = "pickupTime")
    @JsonIgnore
    private List<Reservation> pickupTimeReservations;

    @OneToMany(mappedBy = "dropoffTime")
    @JsonIgnore
    private List<Reservation> dropoffTimeReservations;

}
