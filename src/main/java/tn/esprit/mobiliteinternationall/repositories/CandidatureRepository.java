package tn.esprit.mobiliteinternationall.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mobiliteinternationall.entites.Candidat;
import tn.esprit.mobiliteinternationall.entites.Candidature;

import java.util.Optional;

public interface CandidatureRepository extends JpaRepository<Candidature,Integer> {
    Optional<Candidature> findByCv (String cv);
}
