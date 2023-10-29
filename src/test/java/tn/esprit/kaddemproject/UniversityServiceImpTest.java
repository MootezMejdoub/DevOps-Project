
package tn.esprit.kaddemproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest

public class UniversityServiceImpTest{

@AutoWired
IUniversiteService universiteService
@AutoWired
UniversiteRepository universiteRepository;



@Test
void testAddUniversite(){
    universiteRepository.
    Universite uv= new Universite("esprit");
    Universite savedUv= universiteService.addUniversite(uv);
    assertNotNull(savedUv.getNomUniv());
}
}