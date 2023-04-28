package com.example.etude_cas_sky.repository;

import com.example.etude_cas_sky.entities.Skieur;
import com.example.etude_cas_sky.entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkieurRepository extends JpaRepository<Skieur, Long> {

    public List<Skieur> findByAbonnementTypeAbonnement(TypeAbonnement abonnement_typeAbonnement);



}
