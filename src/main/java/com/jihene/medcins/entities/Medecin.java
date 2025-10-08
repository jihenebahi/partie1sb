package com.jihene.medcins.entities;
import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedecin;
    private String nomMedecin;
    private Double tarifConsultation;
    private Date dateDiplome;
    
    @ManyToOne
    private Specialite specialite;
    public Specialite getSpecialite() {
        return specialite;
    }


    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }


    public Medecin(){
        super();
    }
    

    public Medecin(String nomMedecin, Double tarifConsultation, Date dateDiplome) {
        super();
        this.nomMedecin = nomMedecin;
        this.tarifConsultation = tarifConsultation;
        this.dateDiplome = dateDiplome;
    }


    public Long getIdMedecin() {
        return idMedecin;
    }
    public void setIdMedecin(Long idMedecin) {
        this.idMedecin = idMedecin;
    }
    public String getNomMedecin() {
        return nomMedecin;
    }
    public void setNomMedecin(String nomMedecin) {
        this.nomMedecin = nomMedecin;
    }
    public Double getTarifConsultation() {
        return tarifConsultation;
    }
    public void setTarifConsultation(Double tarifConsultation) {
        this.tarifConsultation = tarifConsultation;
    }
    public Date getDateDiplome() {
        return dateDiplome;
    }
    public void setDateDiplome(Date dateDiplome) {
        this.dateDiplome = dateDiplome;
    }


    @Override
    public String toString() {
        return "Medecin [idMedecin=" + idMedecin + ", nomMedecin=" + nomMedecin + ", tarifConsultation="
                + tarifConsultation + ", dateDiplome=" + dateDiplome + "]";
    }
    

    

}
