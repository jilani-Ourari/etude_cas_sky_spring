package com.example.etude_cas_sky.Service;

import com.example.etude_cas_sky.entities.Couleur;
import com.example.etude_cas_sky.entities.Cours;
import com.example.etude_cas_sky.entities.Inscription;
import com.example.etude_cas_sky.entities.Skieur;
import com.example.etude_cas_sky.repository.CoursRepository;
import com.example.etude_cas_sky.repository.InscriptionRepository;
import com.example.etude_cas_sky.repository.SkieurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class InscriptionService {

    @Autowired
    InscriptionRepository inscriptionRepository ;

    @Autowired
    SkieurRepository skieurRepository;

    @Autowired
    CoursRepository coursRepository;

    public Inscription addInscription(Inscription inscription){
        return inscriptionRepository.save(inscription);
    }
    public List<Inscription> getInscription(){
        return inscriptionRepository.findAll();
    }

    Inscription addInscriptionAndAssignToSkieurAndCours(Inscription inscription, Long numSkieur, Long numCours){
        Optional<Cours> cours = coursRepository.findById(numCours);
        Optional<Skieur> skieur = skieurRepository.findById(numSkieur);
        skieur.ifPresent(inscription::setSkieur);
        cours.ifPresent(inscription::setCours);

        return inscriptionRepository.save(inscription);
    };



}
