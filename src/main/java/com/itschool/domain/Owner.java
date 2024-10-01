package com.itschool.domain;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Column(nullable = false,unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false,unique = true)
    private String buisnessNumber;

    @Column(nullable = false,unique = true)
    private String storeName;

    @Column(nullable = false)
    private String ownerName;

    @Column(nullable = false,unique = true)
    private String callNumber;

    @Builder
    public Owner(String username, String password, String buisnessNumber,
                 String storeName, String ownerName, String callNumber) {
        this.username = username;
        this.password = password;
        this.buisnessNumber = buisnessNumber;
        this.storeName = storeName;
        this.ownerName = ownerName;
        this.callNumber = callNumber;
    }

    public void update(String password,String buisnessNumber, String storeName,
                       String ownerName, String callNumber){
        this.password = password;
        this.buisnessNumber = buisnessNumber;
        this.storeName = storeName;
        this.ownerName = ownerName;
        this.callNumber = callNumber;
    }
}
