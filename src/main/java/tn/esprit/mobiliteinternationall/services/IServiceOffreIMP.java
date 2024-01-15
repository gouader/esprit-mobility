package tn.esprit.mobiliteinternationall.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.mobiliteinternationall.entites.Offre;
import tn.esprit.mobiliteinternationall.entites.StatutOffre;
import tn.esprit.mobiliteinternationall.entites.Universite;
import tn.esprit.mobiliteinternationall.repositories.EntretienRepository;
import tn.esprit.mobiliteinternationall.repositories.OffreRepository;
import tn.esprit.mobiliteinternationall.repositories.UniversiteRepository;

import java.util.Date;
import java.util.List;
@Service
@AllArgsConstructor
@Slf4j

public class IServiceOffreIMP implements IServiceOffre {

    private OffreRepository offreRepository;
    private UniversiteRepository universiteRepository;
    private EntretienRepository entretienRepository;

    @Override
    public Offre addOffre(Offre O) {
        return offreRepository.save(O);
    }

    @Override
    public Offre updateOffre(Offre O) {
        return offreRepository.save(O);
    }

    @Override
    public Offre getOffreId(Integer idOffre) {
        return offreRepository.findById(idOffre).orElse(null);
    }

    @Override
    public List<Offre> getAllOffre() {
        return offreRepository.findAll();
    }

    @Override
    public void removeOffre(Integer idOffre) {
        offreRepository.deleteById(idOffre);

    }

    @Override
    public void addOffreAndAssignUniversite(Offre O, int idUniveriste) {
        Universite universite = universiteRepository.findById(idUniveriste).orElse(null);
        if (universite != null) {
            Offre offre = offreRepository.save(O);
            offre.setUniversite(universite);
            offreRepository.save(offre);

        }
    }

    @Override
    @Scheduled(fixedDelay = 100000000)
    public void changerStatutOffre() {
        List<Offre> offreList = offreRepository.findAll();

        for (Offre offre : offreList) {
            if (offre.getDateFinOffre().before(new Date())) {
                offre.setStatutOffre(StatutOffre.Cloturé);
                offreRepository.save(offre);
            }
        }
    }

    @Override
    @Scheduled(fixedDelay = 20000)
    public void changerStatutOffreNbrePlace() {
        List<Offre> offreList = offreRepository.findAll();


        for (Offre offre : offreList) {

            int nbr = entretienRepository.nbrEntretienAccepte(offre.getIdOffre());
             int  nbr1= nbr;

                if(nbr==nbr1+1) {

                if (offre.getNbrePlaceDispo() > nbr || offre.getNbrePlaceDispo() < nbr) {
                    offre.setNbrePlaceDispo(offre.getNbrePlaceDispo() - 1);
                    nbr1++;


                }



            }

            if (offre.getNbrePlaceDispo()==0) {
                offre.setStatutOffre(StatutOffre.Cloturé);

            }
            offreRepository.save(offre);
            log.info("dd"+nbr+"id"+offre.getIdOffre());

            log.info("teeeeest"+nbr1);


        }


    }


}
