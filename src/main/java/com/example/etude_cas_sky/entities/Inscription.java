package com.example.etude_cas_sky.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "inscription")
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numInscription")
    private Long inscriptionId; // Clé primaire
    private int numSemaine;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cours cours;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Skieur skieur;


}
