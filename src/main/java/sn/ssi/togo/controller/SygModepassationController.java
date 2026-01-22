package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygModepassationDao;

import sn.ssi.togo.model.SygModepassation;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygModepassationController {
   @Autowired
   private ISygModepassationDao sygModepassationDao;

    //Récupérer tous les SygModepassationn
   @GetMapping(value="modepassation")
   public List<SygModepassation> listeSygModepassationn(){

       return sygModepassationDao.findAll();
   }

   //Récupérer un SygModepassationn par son Id
   @GetMapping(value="/modepassation/{id}")
   public Optional<SygModepassation> recupererSygModepassationnId(@PathVariable Long id) {
       Optional <SygModepassation> modepassationId = sygModepassationDao.findById(id);
       return modepassationId;
   }

    //Récupérer un SygModepassationn par son code
    @GetMapping(value="/modepassation/code/{code}")
    public List<SygModepassation > recupererSygModepassationnCode(@PathVariable String code) {
        List<SygModepassation> modepassationscode = sygModepassationDao.findByCodeIgnoreCase(code);
        return modepassationscode ;

    }
   //ajouter un SygModepassation
   @PostMapping(value = "/modepassation")
   public void ajouterSygModepassation(@RequestBody SygModepassation sygModepassation) {
       sygModepassationDao.save(sygModepassation);
    }

   /*modifier un SygModepassation*/
   @PutMapping(value = "/modepassation")
   public void modifierSygModepassation(@Valid @RequestBody SygModepassation sygModepassation) {

       sygModepassationDao.save(sygModepassation);
   }



}
