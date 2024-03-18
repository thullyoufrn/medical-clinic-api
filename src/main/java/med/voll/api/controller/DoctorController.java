package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.doctor.CreateDoctorData;
import med.voll.api.doctor.Doctor;
import med.voll.api.doctor.DoctorRepository;
import med.voll.api.doctor.ListingDoctorData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid CreateDoctorData data) {
        repository.save(new Doctor(data));
    }

    @GetMapping
    public List<ListingDoctorData> list() {
        return repository.findAll().stream().map(ListingDoctorData::new).toList();
    }

}
