package com.example.etude_cas_sky.controller;


import com.example.etude_cas_sky.Service.InscriptionService;
import com.example.etude_cas_sky.Service.SkieurService;
import com.example.etude_cas_sky.entities.Skieur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skieur")
public class SkieurController {
    @Autowired
    SkieurService skieurService;

    @Autowired
    InscriptionService inscriptionService;

    @GetMapping
    public List<Skieur> getSkieur(){
        return skieurService.getAllSkieurs();
    }

    @PostMapping
    public Skieur addSkieur(@RequestBody Skieur skieur){
        skieur.getInscriptions().forEach(inscription -> {
            inscription.setSkieur(skieur);
        });
        return skieurService.addSkieur(skieur);
    }
    @DeleteMapping
    public boolean deleteSkieur(@RequestParam Long id){
        return skieurService.deleteSkieur(id);
    }
    @PutMapping
    public Skieur updateSkieur(@RequestParam Long id,@RequestBody Skieur skieur){
        return skieurService.updateSkieur(id,skieur);
    }


}
