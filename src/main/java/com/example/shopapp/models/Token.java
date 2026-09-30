package com.example.shopapp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "tokens")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "token", nullable = false,length = 255)
    private String token;

    @Column(name = "token_type", nullable = false,length = 50)
    private String tokenType;

    @Column(name = "expiration_date")
    private LocalDateTime expirationDate;

    @Column(name = "revoked", nullable = false)
    private String revoked;

    @Column(name = "expired", nullable = false)
    private String expired;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
