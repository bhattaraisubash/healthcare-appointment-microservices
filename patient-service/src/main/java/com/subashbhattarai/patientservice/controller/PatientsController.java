package com.subashbhattarai.patientservice.controller;

import com.subashbhattarai.patientservice.entity.Patient;
import com.subashbhattarai.patientservice.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/patients")
public class PatientsController {
    @Autowired
    private PatientService patientService;


    @RequestMapping(method = GET, value = "/")
    public ResponseEntity<List<Patient>> getAllPatients(){
        return ResponseEntity.ok(this.patientService.getAllPatients());
    }

    @RequestMapping(method = POST, value = "/")
    public ResponseEntity<Patient> savePatient(@RequestBody Patient patient){
        return ResponseEntity.ok(this.patientService.savePatient(patient));
    }

}
