package com.example.etude_cas_sky.Service;

import com.example.etude_cas_sky.entities.Cours;
import com.example.etude_cas_sky.repository.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursService {

    @Autowired
    CoursRepository coursRepository;

    public Cours addCours(Cours cours){
        return coursRepository.save(cours);
    }
}
