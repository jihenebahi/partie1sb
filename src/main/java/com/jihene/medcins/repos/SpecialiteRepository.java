package com.jihene.medcins.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.jihene.medcins.entities.Specialite;

@RepositoryRestResource(path = "sep") 
@CrossOrigin("http://localhost:4200/") //pour autoriser angular
public interface SpecialiteRepository extends JpaRepository<Specialite,Long>{
    

}
