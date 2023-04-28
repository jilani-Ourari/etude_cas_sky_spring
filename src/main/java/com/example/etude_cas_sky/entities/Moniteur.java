package com.example.etude_cas_sky.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "moniteur")
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numMoniteur")
    private Long numMoniteur; // Clé primaire
    private String nomM;

    private String prenomM;

    private Date dateRecru;

    @OneToMany
    private List<Cours> cours;


}
