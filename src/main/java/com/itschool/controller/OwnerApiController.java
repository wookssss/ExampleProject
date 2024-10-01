package com.itschool.controller;

import com.itschool.domain.Owner;
import com.itschool.dto.AddOwnerRequest;
import com.itschool.dto.OwnerResponse;
import com.itschool.dto.UpdateOwnerRequest;
import com.itschool.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/owners")
public class OwnerApiController {
    private final OwnerService ownerService;

    @PostMapping("")
    public ResponseEntity<Owner> addOwner(@RequestBody AddOwnerRequest request){
        Owner savedOwner = ownerService.create(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedOwner);
    }

    @GetMapping("{key}")
    public ResponseEntity<OwnerResponse> findOwner(@PathVariable Long key){
        Owner owner = ownerService.findOwner(key);

        return ResponseEntity.ok()
                .body(new OwnerResponse(owner));
    }

    @GetMapping("")
    public ResponseEntity<List<OwnerResponse>> findAllOwners(){
        List<OwnerResponse> owners = ownerService.findAll()
                .stream()
                .map(OwnerResponse::new)
                .toList();
        return ResponseEntity.ok().body(owners);
    }

    @DeleteMapping("{key}")
    public ResponseEntity<Void> deleteOwner(@PathVariable Long key){
        ownerService.deleteOwner(key);

        return ResponseEntity.ok().build();
    }
    @PutMapping("{key}")
    public ResponseEntity<Owner>
    update(@PathVariable Long key, @RequestBody UpdateOwnerRequest request){
        Owner savedOwner = ownerService.update(key, request);
        return ResponseEntity.ok().body(savedOwner);
    }
}
