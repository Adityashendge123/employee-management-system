package com.data.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.data.entity.Employee;
import com.data.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public String viewHomePage(Model model) {
        model.addAttribute("employees", service.getAllEmployees());
        return "index";
    }

    @GetMapping("/add")
    public String showAddEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "add-employee";
    }

    @PostMapping("/add")
    public String addEmployee(@ModelAttribute("employee") Employee employee) {
        service.saveEmployee(employee);
        return "redirect:/employees";
    }

    @GetMapping("/edit/{id}")
    public String showEditEmployeeForm(@PathVariable Long id, Model model) {
        model.addAttribute("employee", service.getEmployeeById(id));
        return "edit-employee";
    }

    @PostMapping("/edit/{id}")
    public String editEmployee(@PathVariable Long id, @ModelAttribute("employee") Employee employee) {
        employee.setId(id);
        service.saveEmployee(employee);
        return "redirect:/employees";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
        return "redirect:/employees";
    }
}

