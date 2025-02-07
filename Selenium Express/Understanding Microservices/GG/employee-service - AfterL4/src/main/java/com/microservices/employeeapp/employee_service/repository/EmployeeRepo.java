package com.microservices.employeeapp.employee_service.repository;

import com.microservices.employeeapp.employee_service.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
