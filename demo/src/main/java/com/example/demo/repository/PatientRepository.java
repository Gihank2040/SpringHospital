package com.example.demo.repository;

import com.example.demo.module.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;


public interface PatientRepository extends JpaRepository<Patient, Integer> {
   Patient save(Patient patient);
}
