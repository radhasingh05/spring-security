package com.radha.controller;

import com.radha.core.Employee;
import com.radha.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @GetMapping("/getById/{id}")
    public Optional<Employee> getEmpById(@PathVariable("id") Integer id){
        return employeeService.getById(id);
    }
}
