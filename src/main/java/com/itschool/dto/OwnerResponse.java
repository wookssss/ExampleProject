package com.itschool.dto;

import com.itschool.domain.Owner;
import lombok.Getter;

@Getter
public class OwnerResponse {
    private Long key;
    private final String id;
    private final String password;
    private final String buisnessNumber;
    private final String storeName;
    private final String ownerName;
    private final String callNumber;

    public OwnerResponse(Owner owner) {
        this.key = owner.getKey();
        this.id = owner.getId();
        this.password = owner.getPassword();
        this.buisnessNumber = owner.getBuisnessNumber();
        this.storeName = owner.getStoreName();
        this.ownerName = owner.getOwnerName();
        this.callNumber = owner.getCallNumber();
    }
}
