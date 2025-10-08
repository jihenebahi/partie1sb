package com.jihene.medcins.service;

import java.util.List;

import com.jihene.medcins.entities.Medecin;
import com.jihene.medcins.entities.Specialite;

public interface MedecinService {
    List<com.jihene.medcins.Medecin> getAllMedecins = null;
    Medecin saveMedecin(Medecin m);
    Medecin updateMedecin(Medecin m);
    void deleteMedecin(Medecin m);
    void deleteMedecinById(Long id);
    Medecin getMedecin(Long id);
    List<Medecin> getAllMedecins();

    List<Medecin> findByNomMedecin(String nom); 
    List<Medecin> findByNomMedecinContains(String nom); 
    List<Medecin> findByNomTarif (String nom, Double tarif); 
    List<Medecin> findBySpecialite (Specialite specialite); 
    List<Medecin> findBySpecialiteIdSep(Long id); 
    List<Medecin> findByOrderByNomMedecinAsc(); 
    List<Medecin> trierMedecinsNomsTarif();


}
