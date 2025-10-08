package com.jihene.medcins.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jihene.medcins.entities.Medecin;
import com.jihene.medcins.entities.Specialite;


public interface MedecinRepository extends JpaRepository<Medecin, Long> {
    List<Medecin> findByNomMedecin(String nom);
    List<Medecin> findByNomMedecinContains(String nom);

    //@Query("select m from Medecin m where m.nomMedecin like %?1% and m.tarifConsultation >= ?2")
    //List<Medecin> findByNomTarif (String nom, Double tarif); 

    @Query("select m from Medecin m where m.nomMedecin like %:nom and m.tarifConsultation >= :tarif") 
    List<Medecin> findByNomTarif (@Param("nom") String nom,@Param("tarif") Double tarif); 

    @Query("select m from Medecin m where m.specialite = ?1") 
    List<Medecin> findBySpecialite (Specialite specialite); 

    List<Medecin> findBySpecialiteIdSep(Long id); 

    List<Medecin> findByOrderByNomMedecinAsc();

    @Query("select m from Medecin m order by m.nomMedecin ASC, m.tarifConsultation DESC") 
    List<Medecin> trierMedecinsNomsTarif(); 
}
