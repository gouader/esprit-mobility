package tn.esprit.mobiliteinternationall.services;

import tn.esprit.mobiliteinternationall.entites.Offre;
import tn.esprit.mobiliteinternationall.entites.Universite;

import java.util.List;

public interface IServiceOffre {
    public Offre addOffre(Offre O) ;
    public Offre updateOffre(Offre O) ;
    public Offre getOffreId (Integer idOffre) ;
    public List<Offre> getAllOffre();
    public void removeOffre (Integer idOffre);
    public void addOffreAndAssignUniversite(Offre O, int idUniveriste);
    public  void changerStatutOffre();
    public  void changerStatutOffreNbrePlace();
}
