package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygNatureprixDao;
import sn.ssi.togo.dao.ISygTypesmarchesDao;
import sn.ssi.togo.model.SygMonnaieoffre;
import sn.ssi.togo.model.SygNatureprix;
import sn.ssi.togo.model.SygTypesmarches;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygNaturePrixController {
   @Autowired
   private ISygNatureprixDao sygNatureprixDao;

    //Récupérer tous les SygNaturePrix
   @GetMapping(value="natureprix")
   public List<SygNatureprix> listeSygNatureprix(){

       return sygNatureprixDao.findAll();
   }

   //Récupérer un SygNatureprix par son Id
   @GetMapping(value= "/natureprix/{id}")
   public Optional <SygNatureprix> recupererSygNatureprixId(@PathVariable Long id) {
       Optional <SygNatureprix> natureprix =sygNatureprixDao.findById(id);

       return natureprix;
   }

    //Récupérer un SygModeselection par son Natcode
    @GetMapping(value="/natureprix/natcode/{natCode}")
    public List<SygNatureprix> recupererSygNatureprixNatCode(@PathVariable String natCode) {
        List<SygNatureprix> natureprixNatcode = sygNatureprixDao.findByNatCodeIgnoreCase(natCode);
        return natureprixNatcode ;

    }
   //ajouter un SygNatureprix
   @PostMapping(value = "/natureprix")
   public void ajouterSygNatureprix(@RequestBody SygNatureprix sygNatureprix) {

       sygNatureprixDao.save(sygNatureprix);
    }

   /*modifier un SygNatureprix*/
   @PutMapping(value = "/natureprix")
   public void modifierSygNatureprix(@Valid @RequestBody SygNatureprix sygNatureprix) {

       sygNatureprixDao.save(sygNatureprix);
   }




}
