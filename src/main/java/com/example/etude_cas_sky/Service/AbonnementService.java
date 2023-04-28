package com.example.etude_cas_sky.Service;

import com.example.etude_cas_sky.entities.Abonnement;
import com.example.etude_cas_sky.repository.AbonnementRepositor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbonnementService {

    @Autowired
    AbonnementRepositor abonnementRepository;

    public Abonnement addAbonnement(Abonnement abonnement){
        return abonnementRepository.save(abonnement);
    }
}
