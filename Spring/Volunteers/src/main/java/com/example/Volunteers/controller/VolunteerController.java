package com.example.Volunteers.controller;

import com.example.Volunteers.model.Volunteers;
import com.example.Volunteers.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/volunteers")
public class VolunteerController {

    @Autowired
    private VolunteerService service;

    @GetMapping
    public ResponseEntity<List<Volunteers>> getAll(){
        return ResponseEntity.ok(service.findAllVolunteers());
    }

    @GetMapping("/{name}")
    public ResponseEntity<Volunteers> getByName(@PathVariable String name){
        return service.findByName(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Volunteers> save(@RequestBody Volunteers volunteer){
        return ResponseEntity.ok(service.save(volunteer));
    }

    @DeleteMapping("/{name}")
    public ResponseEntity<Void> delete(@PathVariable String name){
        service.delete(name);
        return ResponseEntity.noContent().build();
    }


}
