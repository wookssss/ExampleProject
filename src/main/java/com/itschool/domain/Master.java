package com.itschool.domain;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Master {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long maseterKey;

    @Column(nullable = false,unique = true)
    private String maseterId;

    @Column(nullable = false,unique = true)
    private String buisnessNumber;

    @Column(nullable = false,unique = true)
    private String storeName;

    @Column(nullable = false)
    private String masterName;

    @Column(nullable = false,unique = true)
    private String callNumber;

}
