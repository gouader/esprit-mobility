package tn.esprit.mobiliteinternationall.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mobiliteinternationall.entites.Candidat;


public interface CandidatRepository extends JpaRepository<Candidat,Integer> {
}
