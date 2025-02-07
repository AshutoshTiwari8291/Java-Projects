package service;

import entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmployeeRepo;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private repository.EmployeeRepo EmployeeRepo;

    public Employee getEmployeeById(int id) {
        Employee employee = EmployeeRepo.findById(id).get();
        return employee;
    }

    public  List<Employee> getAllEmployees() {
        List<Employee> all = EmployeeRepo.findAll();
        return all;
    }
}
