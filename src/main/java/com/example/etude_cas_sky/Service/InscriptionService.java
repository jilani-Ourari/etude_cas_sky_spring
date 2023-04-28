package com.example.etude_cas_sky.Service;

import com.example.etude_cas_sky.entities.Inscription;
import com.example.etude_cas_sky.repository.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscriptionService {

    @Autowired
    InscriptionRepository inscriptionRepository ;

    public Inscription addInscription(Inscription inscription){
        return inscriptionRepository.save(inscription);
    }
    public List<Inscription> getInscription(){
        return inscriptionRepository.findAll();
    }
}
