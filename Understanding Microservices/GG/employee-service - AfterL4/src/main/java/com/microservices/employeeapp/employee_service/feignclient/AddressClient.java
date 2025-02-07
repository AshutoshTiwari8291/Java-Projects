package com.microservices.employeeapp.employee_service.feignclient;

import com.microservices.employeeapp.employee_service.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "addressApis", url = "http://localhost:8081/address-app/api/ ")
public interface AddressClient {

    @GetMapping("/address/{id}")
    AddressResponse getAddressByEmployeeId(@PathVariable("id ") int id);
}
