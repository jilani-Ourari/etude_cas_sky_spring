package com.example.etude_cas_sky.Service;

import com.example.etude_cas_sky.entities.Abonnement;
import com.example.etude_cas_sky.repository.AbonnementRepositor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AbonnementService {

    @Autowired
    AbonnementRepositor abonnementRepository;

    public Abonnement addAbonnement(Abonnement abonnement){
        return abonnementRepository.save(abonnement);
    }


    @Scheduled(fixedRate = 1000)
     public void retrieveSubscriptions() {
          abonnementRepository.findAll().forEach(System.out::println);}

    @Scheduled(fixedRate = 1000)
    public void retrieveSubscriptionsRevunue() {
        float sum = 0;
        List<Abonnement> abonnements = abonnementRepository.findAll();
        for ( Abonnement abonnement : abonnements ) {
            sum += abonnement.getPrixAbon();
        }
        System.out.println("revenue : "+sum);

    }

}