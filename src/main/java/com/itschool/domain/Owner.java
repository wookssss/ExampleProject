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
    @Column(name ="ownerKey", updatable = false)
    private Long key;

    @Column(name = "id",nullable = false,unique = true)
    private String id;

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
    public Owner(String id, String password, String buisnessNumber,
                 String storeName, String ownerName, String callNumber) {
        this.id = id;
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
