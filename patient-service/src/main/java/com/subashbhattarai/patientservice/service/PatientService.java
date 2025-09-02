package com.subashbhattarai.patientservice.service;

import com.subashbhattarai.patientservice.entity.Patient;
import com.subashbhattarai.patientservice.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients(){
        return this.patientRepository.findAll();
    }

    public Patient savePatient(Patient patient){
        return this.patientRepository.save(patient);
    }
}
