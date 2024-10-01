package com.itschool.service;

import com.itschool.domain.Owner;
import com.itschool.dto.AddOwnerRequest;
import com.itschool.dto.OwnerResponse;
import com.itschool.dto.UpdateOwnerRequest;
import com.itschool.repository.OwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OwnerService {
    private final OwnerRepository ownerRepository;

    public Owner create(AddOwnerRequest request){
        return ownerRepository.save(request.toEntity());
    }

    public List<Owner> findAll(){
        return ownerRepository.findAll();
    }

    public Owner findOwner(long key){
        return ownerRepository.findById(key)
                .orElseThrow(()->new IllegalArgumentException("not found: "+key));
    }

    public void deleteOwner(long key){
        ownerRepository.deleteById(key);
    }

    public Owner update(long key, UpdateOwnerRequest request){
        Owner owner = ownerRepository.findById(key).get();
        owner.update(request.getPassword(),
                request.getBuisnessNumber(),
                request.getStoreName(),
                request.getOwnerName(),
                request.getCallNumber());

        return owner;
    }
}
