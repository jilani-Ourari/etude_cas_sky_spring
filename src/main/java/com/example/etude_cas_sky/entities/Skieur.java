package com.example.etude_cas_sky.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "skieur")
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkieur; // Clé primaire
    private String nomS;
    private String prenomS;

    private Date dateNaissance ;

    private String ville;

    @OneToOne
    @JoinColumn(name = "idAbonnement")
    private Abonnement abonnement;

    @ManyToMany
    @JoinTable(name = "skieur_piste",
    joinColumns = @JoinColumn(name = "idPiste"),
            inverseJoinColumns = @JoinColumn(name = "idSkieur"))
    private List<Piste> pistes;

    @OneToMany(mappedBy = "skieur",cascade = CascadeType.ALL)
    private List<Inscription> inscriptions;

    public Long getNumSkieur() {
        return numSkieur;
    }

    public void setNumSkieur(Long numSkieur) {
        this.numSkieur = numSkieur;
    }
}
