package com.example.lab4_20201638_gtics.controller;

import com.example.lab4_20201638_gtics.Entity.Employee;
import com.example.lab4_20201638_gtics.repository.EmployeeRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    final EmployeeRepo employeeRepo;

    public EmployeeController(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @GetMapping(value = {"/lista", ""})
    public String listaEmployee(Model model) {

        List<Employee> lista = employeeRepo.findAll();
        model.addAttribute("employeeList", lista);

        return "lista";
    }
}
