package com.example.lab4_20201638_gtics.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.text.DecimalFormat;
@Getter
@Setter
@Entity

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private Integer employeeID;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;


    @Column(name = "phone number")
    private String phone;

    @Column(name = "hire_date")
    private String date;

    @Column(name = "jod_id")
    private String job_id;
    @Column(name = "salary")
    private DecimalFormat salary;

    @Column(name = "commission_pd")
    private DecimalFormat commission_pd;

    @Column(name = "manager_id")
    private Integer manager_id;
    @Column(name = "department_id")
    private Integer department_id;

    @Column(name = "enabled")
    private Integer enabled;
}
