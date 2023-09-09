package com.example.lab4_20201638_gtics.controller;

import com.example.lab4_20201638_gtics.Entity.Employee;
import com.example.lab4_20201638_gtics.repository.EmployeeRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @PostMapping("/buscarPorNombre")
    public String buscarPorNombre(@RequestParam("searchField") String searchField, Model model) {

        //List<Shipper> lista =  shipperRepository.findByCompanyName(searchField);
        List<Employee> lista = employeeRepo.(searchField);
        model.addAttribute("employee", lista);
        model.addAttribute("textoBuscado", searchField);

        return "shipper/list";
    }
}
