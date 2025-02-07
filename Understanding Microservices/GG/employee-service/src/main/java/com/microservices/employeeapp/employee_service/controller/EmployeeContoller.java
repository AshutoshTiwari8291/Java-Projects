package controller;

import entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.EmployeeRepo;
import service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeContoller {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/{id}")
    public Employee getEmployeeDetails(@PathVariable("id") int id) {
        Employee employee = employeeService.getEmployeeById(id);
        System.out.println("Hererererererer"+id);
        return employee;
    }

    @GetMapping("/")
    public List<Employee> getEmployee() {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }
}
