package com.example.etude_cas_sky.repository;

import com.example.etude_cas_sky.entities.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonnementRepositor extends JpaRepository<Abonnement, Long> {
}
