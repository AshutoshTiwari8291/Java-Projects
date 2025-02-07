package com.microservices.address_service.address_service.service;

import com.microservices.address_service.address_service.entity.Address;
import com.microservices.address_service.address_service.repository.AddressRepo;
import com.microservices.address_service.address_service.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;

    @Autowired
    private ModelMapper modelMapper;

    public AddressResponse findAddressByEmployeeId(int employeeId) {
        Address add = addressRepo.findAddressByEmployeeId(employeeId);
        AddressResponse addressResponse = modelMapper.map(add, AddressResponse.class);

        return addressResponse;
    }
}
