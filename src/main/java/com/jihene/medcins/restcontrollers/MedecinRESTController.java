package com.jihene.medcins.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
  
  @RequestMapping(path="all",method = RequestMethod.GET)
  public List<Medecin> getAllMedecins(){
    return medecinService.getAllMedecins();
  }

  @RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
  //@GetMapping("/getbyid/{id}")
  public Medecin getMedecinById(@PathVariable("id") Long id) {
   return medecinService.getMedecin(id);
 }

 @RequestMapping(value="/addmed",method = RequestMethod.POST)
 //PostMapping("/addmed")
 //@PreAuthorize("hasAuthority('ADMIN')")
  public Medecin createMedecin(@RequestBody Medecin medecin) {
  return medecinService.saveMedecin(medecin);
}

@RequestMapping(value="/updatemed",method = RequestMethod.PUT)
//@PutMapping("/updatemed")
public Medecin updateMedecin(@RequestBody Medecin medecin) {
return medecinService.updateMedecin(medecin);
}
@RequestMapping(value="/medssep/{idSep}",method = RequestMethod.GET)
public List<Medecin> getMedecinsBySepId(@PathVariable("idSep") Long idSep) {
return medecinService.findBySpecialiteIdSep(idSep);
}
@RequestMapping(value="/delmed/{id}",method = RequestMethod.DELETE)
//@DeleteMapping("delmed/{id}")
public void deleteMedecin(@PathVariable("id") Long id)
{
medecinService.deleteMedecinById(id);
}

@RequestMapping(value="/medsByName/{nom}",method = RequestMethod.GET) 
 public List<Medecin> findByNommedecinContains(@PathVariable("nom") String nom) { 
  return medecinService.findByNomMedecinContains(nom); 
 } 


}
