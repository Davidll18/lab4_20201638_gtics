package com.example.lab4_20201638_gtics.repository;

import com.example.lab4_20201638_gtics.Entity.Countrie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepo extends JpaRepository<Countrie, Integer> {

}

