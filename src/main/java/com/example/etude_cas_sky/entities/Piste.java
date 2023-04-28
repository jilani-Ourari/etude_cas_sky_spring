package com.example.etude_cas_sky.entities;


import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "piste")
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPiste")
    private Integer idPiste; // Clé primaire
    private Long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private Integer longeur;
    private Integer pente;

    @ManyToMany(mappedBy = "pistes")
    private List<Skieur> skieurs;
}
