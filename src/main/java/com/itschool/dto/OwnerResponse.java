package com.itschool.dto;

import com.itschool.domain.Owner;
import lombok.Getter;

@Getter
public class OwnerResponse {
    private Long id;
    private final String username;
    private final String buisnessNumber;
    private final String storeName;
    private final String ownerName;
    private final String callNumber;

    public OwnerResponse(Owner owner) {
        this.id = owner.getId();
        this.username = owner.getUsername();
        this.buisnessNumber = owner.getBuisnessNumber();
        this.storeName = owner.getStoreName();
        this.ownerName = owner.getOwnerName();
        this.callNumber = owner.getCallNumber();
    }
}
