package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygFournisseurDao;
import sn.ssi.togo.dao.ISygTypesmarchesDao;
import sn.ssi.togo.model.SygFournisseur;
import sn.ssi.togo.model.SygTypeAutoriteContractante;
import sn.ssi.togo.model.SygTypesmarches;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygTypemarchesController {
   @Autowired
   private ISygTypesmarchesDao sygTypesmarchesDao;

    //Récupérer tous les SygTypesmarches
   @GetMapping(value="typemarches")
   public List<SygTypesmarches> listeSygTypesmarches(){

       return sygTypesmarchesDao.findAll();
   }

   //Récupérer un SygTypesmarches par son Id
   @GetMapping(value= "/typemarches/{id}")
   public Optional <SygTypesmarches> recupererSygTypesmarchesId(@PathVariable Long id) {
       Optional <SygTypesmarches> typesmarches =sygTypesmarchesDao.findById(id);

       return typesmarches;
   }
    //Récupérer un SygTypesmarches par son code
    @GetMapping(value="/typemarches/code/{code}")
    public List<SygTypesmarches> recupererSygTypesmarchesCode(@PathVariable String code) {
        List<SygTypesmarches> typesmarches = sygTypesmarchesDao.findByCodeIgnoreCase(code);
        return typesmarches ;

    }
   //ajouter un SygTypesmarches
   @PostMapping(value = "/typemarches")
   public void ajouterSygTypesmarches(@RequestBody SygTypesmarches sygTypesmarches) {

       sygTypesmarchesDao.save(sygTypesmarches);
    }

   /*modifier un SygTypesmarches*/
   @PutMapping(value = "/typemarches")
   public void modifierSygTypesmarches(@Valid @RequestBody SygTypesmarches sygTypesmarches) {

       sygTypesmarchesDao.save(sygTypesmarches);
   }




}
