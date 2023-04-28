package com.example.etude_cas_sky.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Abonnement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAbonnement;

    private Long numAbon;
    private Date dateDebut;

    private Date dateFin;

    private float prixAbon;

    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbonnement;



}
