package com.tobeto.rentACar.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name = "reservation_status")
@Getter
@Setter
public class ReservationStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "reservation_status_name")
    private String reservationStatusName;

    @OneToMany(mappedBy = "reservationStatus")
    private List<Reservation> reservationStatuses;
}
