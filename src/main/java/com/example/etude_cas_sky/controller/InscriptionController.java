package com.example.etude_cas_sky.controller;

import com.example.etude_cas_sky.Service.InscriptionService;
import com.example.etude_cas_sky.entities.Inscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/inscription")
public class InscriptionController {
    @Autowired
    InscriptionService inscriptionService;

    @PostMapping
    public Inscription addInscription(@RequestBody Inscription inscription){
        return inscriptionService.addInscription(inscription);
    }

    @GetMapping
    public List<Inscription> getInscription(){
        return inscriptionService.getInscription();
    }


}
