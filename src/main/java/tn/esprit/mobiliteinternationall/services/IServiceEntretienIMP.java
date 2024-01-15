package tn.esprit.mobiliteinternationall.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mobiliteinternationall.entites.Candidature;
import tn.esprit.mobiliteinternationall.entites.Entretien;
import tn.esprit.mobiliteinternationall.entites.StatutEntretien;
import tn.esprit.mobiliteinternationall.entites.Universite;
import tn.esprit.mobiliteinternationall.repositories.CandidatureRepository;
import tn.esprit.mobiliteinternationall.repositories.EntretienRepository;
import tn.esprit.mobiliteinternationall.repositories.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IServiceEntretienIMP implements IServiceEntretien{

    private EntretienRepository entretienRepository;
    private CandidatureRepository candidatureRepository;
    private UniversiteRepository universiteRepository;
    @Override
    public Entretien addEntretien(Entretien E) {

        return entretienRepository.save(E);
    }

    @Override
    public Entretien updateEntretien(Entretien E) {
        return entretienRepository.save(E);
    }

    @Override
    public Entretien getEntretienId(Integer idEntretien) {
        return entretienRepository.findById(idEntretien).orElse(null);
    }

    @Override
    public List<Entretien> getAllEntretien() {
        return entretienRepository.findAll();
    }

    @Override
    public void removeEntretien(Integer idEntretien) {
        entretienRepository.deleteById(idEntretien);
    }

    @Override
    public void addEntretienAndAssignCandidatureAndUniversite(Entretien E, int idCandidature,int idUniversite) {
        Candidature candidature = candidatureRepository.findById(idCandidature).orElse(null);
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        if (candidature != null) {
            Entretien entretien = entretienRepository.save(E);
            entretien.setCandidature(candidature);
            entretien.setUniversite(universite);
            entretien.setStatutEntretien(StatutEntretien.EnAttente);
            entretienRepository.save(entretien);
        }


    }}


