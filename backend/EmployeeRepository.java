package com.data.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.data.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

