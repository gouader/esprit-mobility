package tn.esprit.mobiliteinternationall.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mobiliteinternationall.entites.Universite;
import tn.esprit.mobiliteinternationall.repositories.UniversiteRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class IServiceUniversiteIMP implements IServiceUniversite{

    private UniversiteRepository universiteRepositories;

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepositories.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepositories.save(u);
    }

    @Override
    public Universite getUniversiteId(Integer idUniversite) {
        return universiteRepositories.findById(idUniversite).orElse(null);
    }

    @Override
    public List<Universite> getAllUniversite() {
        return universiteRepositories.findAll();
    }

    @Override
    public void removeUniversite(Integer idUniversite) {
        universiteRepositories.deleteById(idUniversite);

    }
}
