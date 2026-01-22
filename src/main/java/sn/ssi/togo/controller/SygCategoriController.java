package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygCategoriDao;
import sn.ssi.togo.dao.ISygTypesmarchesDao;
import sn.ssi.togo.model.SygCategori;
import sn.ssi.togo.model.SygTypesmarches;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SygCategoriController {
   @Autowired
   private ISygCategoriDao sygCategoriDao;

    //Récupérer tous les SygCategori
   @GetMapping(value="categorie")
   public List<SygCategori> listeSygCategori(){

       return sygCategoriDao.findAll();
   }

   //Récupérer un SygCategori par son Id
   @GetMapping(value= "/categorie/{id}")
   public SygCategori recupererCategoriId(@PathVariable Long id) { return sygCategoriDao.findById(id);
   }
   //ajouter un SygCategori
   @PostMapping(value = "/categorie")
   public void ajouterSygCategori(@RequestBody SygCategori sygCategori) {

       sygCategoriDao.save(sygCategori);
    }

   /*modifier un SygCategori*/
   @PutMapping(value = "/categorie")
   public void modifierSygCategori(@Valid @RequestBody SygCategori sygCategori) {

       sygCategoriDao.save(sygCategori);
   }




}
