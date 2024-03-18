package med.voll.api.controller;

import jakarta.transaction.Transactional;
import med.voll.api.patient.CreatePatientData;
import med.voll.api.patient.ListingPatientData;
import med.voll.api.patient.Patient;
import med.voll.api.patient.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("patients")
public class PatientController {

    @Autowired
    private PatientRepository repository;

    @PostMapping
    @Transactional
    public void create(@RequestBody CreatePatientData data) {
        repository.save(new Patient(data));
    }

    @GetMapping
    public List<ListingPatientData> list() {
        return repository.findAll().stream().map(ListingPatientData::new).toList();
    }

}
