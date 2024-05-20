package br.edu.uniara.dp2.malara.controller;

import br.edu.uniara.dp2.malara.model.Employee;
import br.edu.uniara.dp2.malara.model.EmployeeRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository repository;

    @GetMapping("/employees/{id}")
    public Employee one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        "Erro pesquisando id: " +id));
    }
    @PostMapping("/employee")
    public ResponseEntity<Employee> insert(@RequestBody Employee employee){
        var employeeSalvo = repository.save(employee);
        return ResponseEntity.ok(employeeSalvo);
    }
}
