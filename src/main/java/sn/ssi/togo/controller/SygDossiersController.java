
package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygDossiersDao;
import sn.ssi.togo.model.SygDossiers;
//import sn.ssi.togo.model.SygRealisations;


import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygDossiersController {
   @Autowired
   private ISygDossiersDao sygDossiersDao;

    //Récupérer tous les SygDossiers
   @GetMapping(value="dossiers")
   public List<SygDossiers> listeSygDossiers(){

       return sygDossiersDao.findAll();
   }

   //Récupérer un SygDossiers par son Id
   @GetMapping(value= "/dossiers/{id}")
   public Optional  <SygDossiers> recupererSygDossiersId(@PathVariable Long id) {
       Optional  <SygDossiers>  dossiers = sygDossiersDao.findById(id);
       return dossiers;
   }

    //Récupérer un SygDossiers par son reference
    @GetMapping("/dossiers/ref/{dosReference}")
    public List<SygDossiers> recupererSygDossiersReference(@PathVariable String dosReference) {
        List<SygDossiers> dossiersRef = sygDossiersDao.findByDosReference(dosReference);
        return dossiersRef;
    }
   //ajouter un Dossiers
   @PostMapping(value = "/dossiers")
   public void ajouterSygDossiers(@RequestBody SygDossiers sygDossiers) {

       sygDossiersDao.save(sygDossiers);
    }


/*modifier un SygDossiers*/

   @PutMapping(value = "/dossiers")
   public void modifierSygDossiers(@Valid @RequestBody SygDossiers sygDossiers) {

       sygDossiersDao.save(sygDossiers);
   }




}

