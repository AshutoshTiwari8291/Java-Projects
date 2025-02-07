package com.microservices.address_service.address_service.controller;

import com.microservices.address_service.address_service.response.AddressResponse;
import com.microservices.address_service.address_service.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/address/{employeeId}")
    public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("employeeId") int id) {
        AddressResponse addressResponse = addressService.findAddressByEmployeeId(id);

        return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
    }
}
