package com.example.etude_cas_sky.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Data
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCours; // Clé primaire
    private int niveau;
    private String prenomS;

    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;

    @Enumerated(EnumType.STRING)
    private Support support ;

    private Float prix;


    private  int creneau;

    @OneToMany(mappedBy = "cours")
    @JsonIgnore
    private List<Inscription> inscriptions;

    @ManyToOne
    private Moniteur moniteur;
}
