package com.example.etude_cas_sky.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "inscription")
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numInscription")
    private Long idPiste;
    private int numSemaine;

@ManyToOne
    @JoinColumn(name = "idCours")
    private Cours cours;


}
