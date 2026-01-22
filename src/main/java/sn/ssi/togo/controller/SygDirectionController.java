package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygDirectionDao;
import sn.ssi.togo.dao.ISygTypesmarchesDao;
import sn.ssi.togo.model.SygDirection;
import sn.ssi.togo.model.SygTypesmarches;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygDirectionController {
   @Autowired
   private ISygDirectionDao sygDirectionDao;

    //Récupérer tous les SygDirection
   @GetMapping(value="direction")
   public List<SygDirection> listeSygDirection(){

       return sygDirectionDao.findAll();
   }

   //Récupérer un SygDirection par son Id
   @GetMapping(value= "/direction/{id}")
   public Optional <SygDirection> recupererSygDirectionId(@PathVariable Long id) {
       Optional <SygDirection> direction =sygDirectionDao.findById(id);

       return direction;
   }
   //ajouter un SygDirection
   @PostMapping(value = "/direction")
   public void ajouterSygDirection(@RequestBody SygDirection sygDirection) {

       sygDirectionDao.save(sygDirection);
    }

   /*modifier un SygDirection*/
   @PutMapping(value = "/direction")
   public void modifierSygDirection(@Valid @RequestBody SygDirection sygDirection) {

       sygDirectionDao.save(sygDirection);
   }




}
