package br.edu.uniara.dp2.malara;

import br.edu.uniara.dp2.malara.controller.EmployeeController;
import br.edu.uniara.dp2.malara.model.Employee;
import br.edu.uniara.dp2.malara.model.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


public class EmployeeControllerTest {

    @Mock
    private EmployeeRepository repository;

    @InjectMocks
    private EmployeeController controller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testOne() {
        Long id = 1L;
        Employee employee = new Employee("John Doe", "Developer");
        when(repository.findById(id)).thenReturn(Optional.of(employee));

        Employee result = controller.one(id);

        assertEquals(employee, result);
    }

    @Test
    void testOneNotFound() {
        Long id = 1L;
        when(repository.findById(id)).thenReturn(Optional.empty());

        try {
            controller.one(id);
        } catch (RuntimeException e) {
            assertEquals("Erro pesquisando id: " + id, e.getMessage());
        }
    }

    @Test
    void testInsert() {
        Employee employee = new Employee("John Doe", "Developer");
        when(repository.save(employee)).thenReturn(employee);

        ResponseEntity<Employee> response = controller.insert(employee);

        assertEquals(employee, response.getBody());
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}
