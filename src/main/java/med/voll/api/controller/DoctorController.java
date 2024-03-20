package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.doctor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    public Page<ListingDoctorData> read(@PageableDefault(size = 10, sort = {"name"}) Pageable pagination) {
        return repository.findAll(pagination).map(ListingDoctorData::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid UpdateDoctorData data) {
        var doctor = repository.getReferenceById(data.id());
        doctor.update(data);
    }

}
