package tn.esprit.mobiliteinternationall.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mobiliteinternationall.entites.Offre;
import tn.esprit.mobiliteinternationall.entites.Universite;

import java.util.List;

public interface OffreRepository extends JpaRepository<Offre,Integer> {

}
