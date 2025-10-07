package com.example.Volunteers.repository;

import com.example.Volunteers.model.Volunteers;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class VolunteerRepository {

    private final Map<String, Volunteers> volunteers = new HashMap<>();

    public List<Volunteers> findAllVolunteers(){
        return new ArrayList<>(volunteers.values());
    }

    public Optional<Volunteers> findVolunteerByName(String name){
        return Optional.ofNullable(volunteers.get(name));
    }

    public Volunteers save(Volunteers volunteer){
        volunteers.put(volunteer.getName(),volunteer);
        return volunteer;
    }

    public void delete(String name){
        volunteers.remove(name);
    }
}
