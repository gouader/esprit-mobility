package tn.esprit.mobiliteinternationall.services;

import tn.esprit.mobiliteinternationall.entites.Universite;

import java.util.List;

public interface IServiceUniversite {
    public Universite addUniversite(Universite u) ;
    public Universite updateUniversite(Universite u) ;
    public Universite getUniversiteId (Integer idUniversite) ;
    public List<Universite> getAllUniversite();
    public void removeUniversite (Integer idUniversite);
}
