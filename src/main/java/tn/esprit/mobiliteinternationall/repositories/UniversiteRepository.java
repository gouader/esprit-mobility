package tn.esprit.mobiliteinternationall.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mobiliteinternationall.entites.Universite;

import java.util.List;

public interface UniversiteRepository extends JpaRepository<Universite,Integer> {
    List<Universite>findByPays(String pays);
}
