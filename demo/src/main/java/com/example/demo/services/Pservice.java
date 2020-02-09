package com.example.demo.services;

import com.example.demo.module.Patient;
import com.example.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.module.Patient;

@Service
public class Pservice implements PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    Patient patient;

    @Override
    public Patient save() {
       return patientRepository.save(patient);
    }
/*
public Patient save(Patient patient){
  return patientRepository.save(patient);
    }
*/


}
