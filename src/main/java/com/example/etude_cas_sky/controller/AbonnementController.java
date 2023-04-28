package com.example.etude_cas_sky.controller;

import com.example.etude_cas_sky.Service.AbonnementService;
import com.example.etude_cas_sky.entities.Abonnement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abonnement")
public class AbonnementController {

    @Autowired
    AbonnementService abonnementService;

    @PostMapping
    public Abonnement addAbonnement(@RequestBody Abonnement abonnement){
        return abonnementService.addAbonnement(abonnement);
    }
}
