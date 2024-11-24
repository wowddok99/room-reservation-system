package com.example.room_reservation_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="accommodation")
@Entity
public class Accommodation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accommodation_id")
    private Long id;

    private String name;
    private String location;
    private String description;
    private Double price;

    @OneToMany(mappedBy = "accommodation")
    private List<Room> rooms; // 숙소에 속한 방들

    @OneToMany(mappedBy = "accommodation")
    private List<Reservation> reservations;
}
