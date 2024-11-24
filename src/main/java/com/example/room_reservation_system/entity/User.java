//package com.example.room_reservation_system.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//import java.util.List;
//
//@Builder
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name="user")
//@Entity
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "user_id")
//    private Long id;
//
//    private String username;
//    private String password;
//    private String email;
//
//    @OneToMany(mappedBy = "user")
//    private List<Reservation> reservations;
//}
