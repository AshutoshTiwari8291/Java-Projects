package controller;

import com.microservices.employeeapp.employee_service.controller.EmployeeContoller;
import com.microservices.employeeapp.employee_service.response.EmployeeResponse;
import com.microservices.employeeapp.employee_service.service.EmployeeService;
import jakarta.ws.rs.core.MediaType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class EmployeeControllerTest {

    @Mock
    private EmployeeService employeeService;

    @InjectMocks
    private EmployeeContoller employeeContoller;

    private MockMvc mockMvc;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(employeeContoller).build();
    }

    @Test
    void getEmployeeDetailById() throws Exception {
        EmployeeResponse mockResponse = new EmployeeResponse(1, "John Doe", "john.doe@example.com", "Software Engineer");
        when(employeeService.getEmployeeById(1)).thenReturn(mockResponse);


        mockMvc.perform(get("/employees/1"))
                .andExpect(status().isCreated());

        verify(employeeService, times(1)).getEmployeeById(1);
    }
}
