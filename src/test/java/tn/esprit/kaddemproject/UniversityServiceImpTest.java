
package tn.esprit.kaddemproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest

public class UniversityServiceImpTest{

@AutoWired
IUniversiteService universiteService




@Test
void testAddUniversite(){
   
    Universite uv= new Universite("esprit");
    Universite savedUv= universiteService.addUniversite(uv);
    assertNotNull(savedUv.getNomUniv());
}
}