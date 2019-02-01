/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rest.files;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author nihar
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class EmployeeRestController {

    List<Employee> employee;

    @PostConstruct
    public void loadData() {
        employee = new ArrayList<>();

        employee.add(new Employee("Nihar", "Patel"));
        employee.add(new Employee("Nihir", "Patel"));
        employee.add(new Employee("Nihal", "Patel"));
        employee.add(new Employee("Nirav", "Patel"));
        employee.add(new Employee("Niharika", "Patel"));
        employee.add(new Employee("Nihariyo", "Patel"));
    }
    
    @GetMapping("/employee")
    public List<Employee> getEmployee() {

        return employee;
    }
    
    @GetMapping("/employee/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        
        if(employeeId >= employee.size() || (employeeId<0))
        {
            throw new EmployeeNotFoundException("Can not find Employee id "+ employeeId);
        }
        return employee.get(employeeId);
    }
    
    
    
}
