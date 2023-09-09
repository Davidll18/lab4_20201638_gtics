package com.example.lab4_20201638_gtics.repository;

import com.example.lab4_20201638_gtics.Entity.Countrie;
import com.example.lab4_20201638_gtics.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
   // @Query(nativeQuery = true, value = "select * from employees where  department_id  like '%?%')
    // List<Employee> buscarPorIdDepartment (Integer numero);

}

