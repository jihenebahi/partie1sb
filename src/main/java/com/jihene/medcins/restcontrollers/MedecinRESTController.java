package com.jihene.medcins.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.jihene.medcins.entities.Medecin;
import com.jihene.medcins.service.MedecinService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MedecinRESTController {
  @Autowired
  MedecinService medecinService;
  
  @RequestMapping(method = RequestMethod.GET)
  List<Medecin> getAllMedecins(){
    return medecinService.getAllMedecins();
  }

  @RequestMapping(value="/{id}",method = RequestMethod.GET)
  public Medecin getMedecinById(@PathVariable("id") Long id) {
   return medecinService.getMedecin(id);
 }


}
