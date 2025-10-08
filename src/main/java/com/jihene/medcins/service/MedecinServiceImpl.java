package com.jihene.medcins.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jihene.medcins.entities.Medecin;
import com.jihene.medcins.entities.Specialite;
import com.jihene.medcins.repos.MedecinRepository;

@Service
public class MedecinServiceImpl implements MedecinService{
    @Autowired
    MedecinRepository medecinRepository;
    @Override
    public Medecin saveMedecin(Medecin m) {
        return medecinRepository.save(m);
    }

    @Override
    public Medecin updateMedecin(Medecin m) {
        return medecinRepository.save(m);
    }

    @Override
    public void deleteMedecin(Medecin m) {
        medecinRepository.delete(m);
    }

    @Override
    public void deleteMedecinById(Long id) {
        medecinRepository.deleteById(id);
    }

    @Override
    public Medecin getMedecin(Long id) {
        return medecinRepository.findById(id).get();
    }

    @Override
    public List<Medecin> getAllMedecins() {
      return medecinRepository.findAll();
    }

    @Override
    public List<Medecin> findByNomMedecin(String nom) {
        return medecinRepository.findByNomMedecin(nom);
    }

    @Override
    public List<Medecin> findByNomMedecinContains(String nom) {
       return medecinRepository.findByNomMedecinContains(nom);
    }

    @Override
    public List<Medecin> findByNomTarif(String nom, Double tarif) {
        return medecinRepository.findByNomTarif(nom, tarif) ;   
    }

    @Override
    public List<Medecin> findBySpecialite(Specialite specialite) {
        return medecinRepository.findBySpecialite(specialite);
        
    }

    @Override
    public List<Medecin> findBySpecialiteIdSep(Long id) {
       return medecinRepository.findBySpecialiteIdSep(id);
    }

    @Override
    public List<Medecin> findByOrderByNomMedecinAsc() {
      return medecinRepository.findByOrderByNomMedecinAsc();
    }

    @Override
    public List<Medecin> trierMedecinsNomsTarif() {
       return medecinRepository.trierMedecinsNomsTarif(); 
    }

}
