package com.example.Volunteers.service;

import com.example.Volunteers.model.Volunteers;
import com.example.Volunteers.repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VolunteerService {

    @Autowired
    private final VolunteerRepository volunteerRepository;

    public VolunteerService(VolunteerRepository volunteerRepository) {
        this.volunteerRepository = volunteerRepository;
    }

    public List<Volunteers> findAllVolunteers(){
        return volunteerRepository.findAllVolunteers();
    }

    public Optional<Volunteers> findByName(String name){
        return volunteerRepository.findVolunteerByName(name);
    }

    public Volunteers save(Volunteers volunteer){
        return volunteerRepository.save(volunteer);
    }

    public void delete(String name){
        volunteerRepository.delete(name);
    }
}
