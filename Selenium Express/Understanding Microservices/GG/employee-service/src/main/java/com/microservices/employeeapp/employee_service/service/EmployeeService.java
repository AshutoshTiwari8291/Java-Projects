package com.microservices.employeeapp.employee_service.service;

import com.microservices.employeeapp.employee_service.entity.Employee;
import com.microservices.employeeapp.employee_service.repository.EmployeeRepo;
import com.microservices.employeeapp.employee_service.response.AddressResponse;
import com.microservices.employeeapp.employee_service.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo EmployeeRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ModelMapper modelMapper;

//    @Autowired
//    private WebClient webClient;
//
//    @Autowired
//    private DiscoveryClient discoveryClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

//    @Value("${address-service.base.url}")
//    private String addressBase;

//    public EmployeeService(@Value("${address-service.base.url}") String addressBase, RestTemplateBuilder builder) {
//        System.out.println("Uri"+addressBase);
//        this.restTemplate = builder
//                            .rootUri(addressBase)
//                            .build();
//    }

    public EmployeeResponse getEmployeeById(int id) {
        Employee employee = EmployeeRepo.findById(id).get();
        EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);

        // Set data by making rest api call
        // This is a reactive
//        AddressResponse addressResponse = webClient.get().uri("/address/"+ id).retrieve().bodyToMono(AddressResponse.class).block();
        AddressResponse addressResponse = callingAddressServiceUsingRestTemplate(id);
        System.out.print("Add"+addressResponse);
        employeeResponse.setAddressResponse(addressResponse);
        return employeeResponse;
    }

    private AddressResponse callingAddressServiceUsingRestTemplate(int id) {
//        List<ServiceInstance> instances = discoveryClient.getInstances("address-app");
//        ServiceInstance instance = instances.get(0);
//        String uri = instance.getUri().toString();

//        ServiceInstance instance = loadBalancerClient.choose("address-app");
//        String uri = instance.getUri().toString();
//        String contextRoot = instance.getMetadata().get("configPath");


        // load balancing will happen automatically as we have provided the notation.
        return restTemplate.getForObject("http://ADDRESS-APP/address-app/api/address/{id}", AddressResponse.class, id);
    }
}
