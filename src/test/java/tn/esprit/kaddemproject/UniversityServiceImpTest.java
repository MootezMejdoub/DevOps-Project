
package tn.esprit.kaddemproject;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.kaddemproject.entities.Universite;
import tn.esprit.kaddemproject.services.IUniversiteService;

@SpringBootTest
public class UniversityServiceImpTest{

@Autowired
IUniversiteService universiteService;




@Test
public void testAddUniversite(){

    Universite uv= new Universite(1,"university",null);
    Universite savedUv= universiteService.addUniversite(uv);
    assertNotNull(savedUv.getNomUniv());

}
}