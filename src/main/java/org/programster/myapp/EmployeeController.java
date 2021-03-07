package org.programster.myapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.programster.myapp.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class EmployeeController 
{
    @Autowired
    private EmployeeRepository employeeRepository;
    
    
    
    @GetMapping("/employees")
    public Iterable<Employee> retrieveAllEmployees() 
    {
        return employeeRepository.findAll();
    }
}
