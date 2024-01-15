package tn.esprit.mobiliteinternationall.services;

import tn.esprit.mobiliteinternationall.entites.Entretien;
import tn.esprit.mobiliteinternationall.entites.Offre;

import java.util.List;

public interface IServiceEntretien {
    public Entretien addEntretien(Entretien E) ;
    public Entretien updateEntretien(Entretien E) ;
    public Entretien getEntretienId (Integer idEntretien) ;
    public List<Entretien> getAllEntretien();
    public void removeEntretien (Integer idEntretien);
    public void addEntretienAndAssignCandidatureAndUniversite(Entretien E, int idCandidatute,int idUniversite );
}
