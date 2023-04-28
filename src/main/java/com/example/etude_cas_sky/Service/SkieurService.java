package com.example.etude_cas_sky.Service;

import com.example.etude_cas_sky.entities.*;
import com.example.etude_cas_sky.repository.PisteRepository;
import com.example.etude_cas_sky.repository.SkieurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class SkieurService {
    @Autowired
     SkieurRepository skieurRepository;

@Autowired
    PisteRepository pisteRepository;
 public Skieur addSkieur(Skieur skieur){
        return skieurRepository.save(skieur);
    }
    public Optional<Skieur> getSkieurById(Long id){
        return skieurRepository.findById(id);
    }

    public Skieur updateSkieur(Long id, Skieur skieur) {
        Optional<Skieur> existingSkieur = skieurRepository.findById(id);
        if (existingSkieur.isPresent()) {
            skieur.setNumSkieur(id);
            return skieurRepository.save(skieur);
        } else {
            return null;
        }
    }
    public boolean deleteSkieur(Long id) {
        Optional<Skieur> existingSkieur = skieurRepository.findById(id);
        if (existingSkieur.isPresent()) {
            skieurRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
    public List<Skieur> getAllSkieurs(){
        return skieurRepository.findAll();
    }

    public List<Skieur> getSkieurByAbonnement(TypeAbonnement typeAbonnement){
        return skieurRepository.findByAbonnementTypeAbonnement(typeAbonnement);
    }

  public Optional<Skieur> findById(Long id){
        return skieurRepository.findById(id);
    }
    HashMap<Couleur,Integer> nombreSkieursParCouleurPiste(){
        HashMap<Couleur,Integer> map = new HashMap<>();
        List<Skieur> skieurs= skieurRepository.findAll();

        for (Skieur skieur:skieurs) {
           for (Piste piste:skieur.getPistes()) {
               Couleur couleur = piste.getCouleur();
               if(map.containsKey(couleur)){
                   map.put(couleur,map.get(couleur)+1);
               }else{
                   map.put(couleur,0);
               }
        }

        }
return map;
    };
}
