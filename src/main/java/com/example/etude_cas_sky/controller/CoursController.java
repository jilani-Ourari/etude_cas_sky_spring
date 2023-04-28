package com.example.etude_cas_sky.controller;

import com.example.etude_cas_sky.Service.CoursService;
import com.example.etude_cas_sky.entities.Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cours")
public class CoursController {
    @Autowired
    CoursService coursService;

    @PostMapping
    public Cours addCours(@RequestBody Cours cours){
        return coursService.addCours(cours);
    }

}
