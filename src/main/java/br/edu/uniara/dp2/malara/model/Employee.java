package br.edu.uniara.dp2.malara.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.processing.Generated;
@Data
@Entity
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer idade;

    private String role;

    public Employee(String name, Integer idade, String role) {
        this.name = name;
        this.idade = idade;
        this.role = role;
    }
}
