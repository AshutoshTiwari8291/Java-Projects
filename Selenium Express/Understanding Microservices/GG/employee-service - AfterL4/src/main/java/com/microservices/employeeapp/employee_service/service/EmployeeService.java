package com.microservices.employeeapp.employee_service.service;

import com.microservices.employeeapp.employee_service.entity.Employee;
import com.microservices.employeeapp.employee_service.feignclient.AddressClient;
import com.microservices.employeeapp.employee_service.repository.EmployeeRepo;
import com.microservices.employeeapp.employee_service.response.AddressResponse;
import com.microservices.employeeapp.employee_service.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo EmployeeRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    AddressClient addressClient;

    public EmployeeResponse getEmployeeById(int id) {
        Employee employee = EmployeeRepo.findById(id).get();
        EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);


        AddressResponse addressResponse = addressClient.getAddressByEmployeeId(id);
        employeeResponse.setAddressResponse(addressResponse);
        return employeeResponse;
    }

    public List<EmployeeResponse> getAllEmployees() {
        List<Employee> employees = EmployeeRepo.findAll();
        List<EmployeeResponse> employeesResponse = employees.stream().map(employee -> {
            EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);
            try {
                // Attempt to fetch the address
                AddressResponse addressResponse = addressClient.getAddressByEmployeeId(employee.getId());
                employeeResponse.setAddressResponse(addressResponse);
            } catch (Exception e) {
                // Handle the case where no address is found or any other exception occurs
                System.err.println("No address found for Employee ID: " + employee.getId() + ". Exception: " + e.getMessage());
                employeeResponse.setAddressResponse(null); // Optionally set a default value
            }
            return employeeResponse;
        }).toList();

        return employeesResponse;
    }
}
