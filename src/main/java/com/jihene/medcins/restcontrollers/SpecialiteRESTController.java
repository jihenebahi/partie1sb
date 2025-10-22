package com.jihene.medcins.restcontrollers;

import org.springframework.web.bind.annotation.RestController;
import java.util.List; 
import com.jihene.medcins.entities.Specialite;
import com.jihene.medcins.repos.SpecialiteRepository;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/sep")
@CrossOrigin("*")
public class SpecialiteRESTController {
    
    @Autowired
    SpecialiteRepository specialiteRepository;

     
    @RequestMapping(method=RequestMethod.GET) 
    public List<Specialite> getAllCategories() 
    { 
    return specialiteRepository.findAll(); 
   }

   @RequestMapping(value="/{id}",method = RequestMethod.GET) 
   public Specialite getSpecialiteById(@PathVariable("id") Long id) { 
   return specialiteRepository.findById(id).get(); 
   } 
}
