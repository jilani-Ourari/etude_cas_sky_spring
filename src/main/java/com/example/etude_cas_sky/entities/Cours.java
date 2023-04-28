package com.example.etude_cas_sky.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPiste")
    private Long numCours; // Clé primaire
    private int niveau;
    private String prenomS;

    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;

    @Enumerated(EnumType.STRING)
    private Support support ;

    private Float prix;


    private  int creneau;

    @OneToMany
    @JoinColumn(name = "idCours")
    private List<Inscription> inscriptions;

    @ManyToOne
    @JoinColumn(name = "idSkieur")
    private Skieur skieur;

    @ManyToOne
    private Moniteur moniteur;
}
