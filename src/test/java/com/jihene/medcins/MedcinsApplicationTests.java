package com.jihene.medcins;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.jihene.medcins.repos.MedecinRepository;
import com.jihene.medcins.entities.Medecin;
import com.jihene.medcins.entities.Specialite;
@SpringBootTest
class MedcinsApplicationTests {

	@Autowired
    private MedecinRepository medecinRepository;
    @Test
    public void testCreateMedecin() {
    Medecin med = new Medecin("Houda" ,50.00,new Date());
    medecinRepository.save(med);
}

@Test
public void testFindMedecin()
{
Medecin m = medecinRepository.findById(1L).get();
System.out.println(m);
}
   
@Test
public void testUpdateMedecin()
{
Medecin m = medecinRepository.findById(1L).get();
m.setTarifConsultation(80.00);
medecinRepository.save(m);
System.out.println(m);
}

@Test
public void testDeleteMedecin()
{
    medecinRepository.deleteById(1L);

}
@Test
public void testFindAllMedecin()
{
    List<Medecin> meds= medecinRepository.findAll();
    for (Medecin m:meds)
    System.out.println(m);

}
@Test
public void testFindMedecinByNom()
{
List<Medecin> meds = medecinRepository.findByNomMedecin("Houda");
 for (Medecin m:meds)
    System.out.println(m);

}
@Test
public void testFindMedecinByNomContains()
{
List<Medecin> meds = medecinRepository.findByNomMedecinContains("s");
 for (Medecin m:meds)
    System.out.println(m);

}
@Test 
 
public void testfindByNomTarif() 
{ 
List<Medecin>  meds = medecinRepository.findByNomTarif("sami", 70.0); 
   for (Medecin m : meds) 
     { 
        System.out.println(m); 
     } 
} 
@Test 
public void testfindBySpecialite() 
{ 
Specialite sep = new Specialite(); 
sep.setIdSep(1L);    
List<Medecin>  meds = medecinRepository.findBySpecialite(sep); 
for (Medecin m : meds) 
{ 
System.out.println(m); 
} 
}
@Test 
public void findBySpecialiteIdSep() 
{    
List<Medecin>  meds = medecinRepository.findBySpecialiteIdSep(1L); 
for (Medecin m : meds) 
{ 
System.out.println(m); 
} 
}
@Test 
 public void testfindByOrderByNomMedecinAsc() 
  { 
  List<Medecin>  meds = medecinRepository.findByOrderByNomMedecinAsc(); 
   for (Medecin m : meds) 
   { 
    System.out.println(m); 
   }  
} 
@Test 
 public void testTrierMedecinsNomsTarif() 
  { 
    List<Medecin>  meds = medecinRepository.trierMedecinsNomsTarif();
   
   for (Medecin m : meds) 
   { 
    System.out.println(m); 
   } 
  } 

}
 
