package com.microservices.employeeapp.employee_service.controller;

import com.microservices.employeeapp.employee_service.entity.Employee;
import com.microservices.employeeapp.employee_service.response.EmployeeResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservices.employeeapp.employee_service.service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeContoller {

    Logger logger = LoggerFactory.getLogger(EmployeeContoller.class);

    @Autowired
    EmployeeService employeeService;


    @GetMapping("employees/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") int id) {
        logger.info("This an Logger");
        EmployeeResponse employeeResponse = employeeService.getEmployeeById(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeResponse);
    }

    @GetMapping("employees")
    public ResponseEntity<List<EmployeeResponse>> getAllEmployees() {
        List<EmployeeResponse> employeeResponseList =  employeeService.getAllEmployees();

        return ResponseEntity.status(HttpStatus.OK).body(employeeResponseList);
    }
}
