package com.jihene.medcins.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Specialite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSep;

    private String nomSep;
    private String descriptionSep;

    @OneToMany (mappedBy = "specialite")
    @JsonIgnore
    private List<Medecin> medecins;

    public Specialite() {
        super();
    }

    public List<Medecin> getMedecins() {
        return medecins;
    }
    public void setMedecins(List<Medecin> medecins) {
        this.medecins = medecins;
    }
    
    public Long getIdSep() {
        return idSep;
    }
    public void setIdSep(Long idSep) {
        this.idSep = idSep;
    }
    public String getNomSep() {
        return nomSep;
    }
    public void setNomSep(String nomSep) {
        this.nomSep = nomSep;
    }
    public String getDescriptionSep() {
        return descriptionSep;
    }

    public void setDescriptionSep(String descriptionSep) {
        this.descriptionSep = descriptionSep;
    }

    


    

}
