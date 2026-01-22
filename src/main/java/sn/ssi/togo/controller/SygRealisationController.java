
package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygRealisationsDao;

import sn.ssi.togo.model.SygRealisations;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygRealisationController {
   @Autowired
   private ISygRealisationsDao sygRealisationsDao;

    //Récupérer tous les SygRealisations
   @GetMapping(value="realisations")
   public List<SygRealisations> listeSygRealisations(){

       return sygRealisationsDao.findAll();
   }

   //Récupérer un SygRealisations par son Id
   @GetMapping(value = "/realisations/{id}")
   public Optional<SygRealisations> recupererSygRealisationsId(@PathVariable Long id) {
       Optional<SygRealisations> realisations = sygRealisationsDao.findById(id);
      return realisations;

   }
    @GetMapping("/realisations/ref/{reference}")
    public List<SygRealisations> recupererSygRealisationsReference(@PathVariable String reference) {
        List<SygRealisations> realisationsRef = sygRealisationsDao.findByReferenceIgnoreCase(reference);
        return realisationsRef;
    }
   //ajouter un SygRealisations
   @PostMapping(value = "/realisations")
   public void ajouterSygRealisations(@RequestBody SygRealisations sygRealisations) {

       sygRealisationsDao.save(sygRealisations);
    }




/*modifier un SygRealisations*/

   @PutMapping(value = "/realisations")
   public void modifierSygRealisations(@Valid @RequestBody SygRealisations sygRealisations) {

       sygRealisationsDao.save(sygRealisations);
   }




}

