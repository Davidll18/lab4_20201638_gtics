package com.example.lab4_20201638_gtics.repository;

import com.example.lab4_20201638_gtics.Entity.Countrie;
import com.example.lab4_20201638_gtics.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}

