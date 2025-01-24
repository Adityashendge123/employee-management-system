package com.data.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.entity.Employee;
import com.data.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}

