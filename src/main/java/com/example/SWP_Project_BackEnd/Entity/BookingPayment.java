package com.example.SWP_Project_BackEnd.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bookingpayment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingPaymentId;

    private String status;
}

