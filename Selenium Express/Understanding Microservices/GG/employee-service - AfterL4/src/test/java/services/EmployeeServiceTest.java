package services;

import com.microservices.employeeapp.employee_service.entity.Employee;
import com.microservices.employeeapp.employee_service.feignclient.AddressClient;
import com.microservices.employeeapp.employee_service.repository.EmployeeRepo;
import com.microservices.employeeapp.employee_service.response.AddressResponse;
import com.microservices.employeeapp.employee_service.response.EmployeeResponse;
import com.microservices.employeeapp.employee_service.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class EmployeeServiceTest {


    @Mock
    private EmployeeRepo employeeRepo;

    @Mock
    private ModelMapper modelMapper;

    @Mock
    private AddressClient addressClient;

    @InjectMocks
    private EmployeeService employeeService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getEmployeeById_validId() {
        // Arrange
        Employee mockEmployee = new Employee(1, "John Doe", "john.doe@example.com");
        EmployeeResponse mockEmployeeResponse = new EmployeeResponse(1, "John Doe", "john.doe@example.com", null);
        AddressResponse mockAddressResponse = new AddressResponse(1, "123 Main St", "Cityville", "State", "12345");

        when(employeeRepo.findById(1)).thenReturn(Optional.of(mockEmployee));
        when(modelMapper.map(mockEmployee, EmployeeResponse.class)).thenReturn(mockEmployeeResponse);
        when(addressClient.getAddressByEmployeeId(1)).thenReturn(mockAddressResponse);

        // Act
        EmployeeResponse result = employeeService.getEmployeeById(1);

        // Assert
        assertNotNull(result);
        assertEquals(1, result.getId());
        assertEquals("John Doe", result.getName());
        assertEquals(mockAddressResponse, result.getAddressResponse());

        verify(employeeRepo, times(1)).findById(1);
        verify(addressClient, times(1)).getAddressByEmployeeId(1);
    }


    @Test
    void getEmployeeById_employeeNotFound() {
        // Arrange
        when(employeeRepo.findById(99)).thenReturn(Optional.empty());

        // Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            employeeService.getEmployeeById(99);
        });

        assertEquals("No value present", exception.getMessage()); // From Optional.get()
        verify(employeeRepo, times(1)).findById(99);
        verify(addressClient, never()).getAddressByEmployeeId(anyInt());
    }


    @Test
    void getAllEmployees_validEmployees() {
        // Arrange
        Employee employee1 = new Employee(1, "John Doe", "john.doe@example.com");
        Employee employee2 = new Employee(2, "Jane Smith", "jane.smith@example.com");

        EmployeeResponse response1 = new EmployeeResponse(1, "John Doe", "john.doe@example.com", null);
        EmployeeResponse response2 = new EmployeeResponse(2, "Jane Smith", "jane.smith@example.com", null);

        AddressResponse address1 = new AddressResponse(1, "123 Main St", "Cityville", "State", "12345");
        AddressResponse address2 = new AddressResponse(2, "456 Elm St", "Townsville", "Region", "67890");

        List<Employee> employees = Arrays.asList(employee1, employee2);

        when(employeeRepo.findAll()).thenReturn(employees);
        when(modelMapper.map(employee1, EmployeeResponse.class)).thenReturn(response1);
        when(modelMapper.map(employee2, EmployeeResponse.class)).thenReturn(response2);
        when(addressClient.getAddressByEmployeeId(1)).thenReturn(address1);
        when(addressClient.getAddressByEmployeeId(2)).thenReturn(address2);

        // Act
        List<EmployeeResponse> result = employeeService.getAllEmployees();

        // Assert
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("John Doe", result.get(0).getName());
        assertEquals("Jane Smith", result.get(1).getName());

        verify(employeeRepo, times(1)).findAll();
        verify(addressClient, times(2)).getAddressByEmployeeId(anyInt());
    }

}
