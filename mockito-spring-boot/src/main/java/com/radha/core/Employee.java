package com.radha.core;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
@Getter
@Setter
@Table(name = "person")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer empId;

    @Column(name = "first_name")
    @Size(min = 3, max = 20)
    private String firstName;

    @Column(name = "last_name")
    @Size(min = 3, max = 20)
    private String lastName;

}
