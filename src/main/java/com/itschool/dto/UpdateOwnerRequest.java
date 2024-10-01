package com.itschool.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateOwnerRequest {
    private String password;
    private String buisnessNumber;
    private String storeName;
    private String ownerName;
    private String callNumber;
}

