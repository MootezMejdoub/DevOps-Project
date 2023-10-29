
package tn.esprit.kaddemproject;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.kaddemproject.entities.Departement;
import tn.esprit.kaddemproject.entities.Universite;
import tn.esprit.kaddemproject.services.IUniversiteService;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class UniversityServiceImpTest{

@Autowired
IUniversiteService universiteService;




@Test
public void testAddUniversite(){
    List<Departement> departementList=new ArrayList<>();
    Departement departement=new Departement(1,"null",null);
    departementList.add(departement);

    List<Universite> list=universiteService.retrieveAll();
    int ex=list.size();
    Universite uv= new Universite(1,"university",departementList);


    Universite savedUv= universiteService.addUniversite(uv);
    assertNotNull(savedUv.getNomUniv());
    assertEquals(ex+1,universiteService.retrieveAll().size());
   // assertNotNull(savedUv.getNomUniv());

}
}