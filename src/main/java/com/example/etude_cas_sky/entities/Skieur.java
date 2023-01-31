package com.example.etude_cas_sky.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "skieur")
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPiste")
    private Long numSkieur; // Clé primaire
    private String nomS;
    private String prenomS;

    private Date dateNaissance ;

    private String ville;




}
