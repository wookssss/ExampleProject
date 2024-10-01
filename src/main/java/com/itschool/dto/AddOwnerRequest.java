package com.itschool.dto;

import com.itschool.domain.Owner;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddOwnerRequest {
    private String username;
    private String password;
    private String buisnessNumber;
    private String storeName;
    private String ownerName;
    private String callNumber;

    public Owner toEntity(){
        return Owner.builder()
                .username(username)
                .password(password)
                .buisnessNumber(buisnessNumber)
                .storeName(storeName)
                .ownerName(ownerName)
                .callNumber(callNumber)
                .build();
    }
}
