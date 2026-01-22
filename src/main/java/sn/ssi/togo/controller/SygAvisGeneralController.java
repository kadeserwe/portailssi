package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygAvisGeneralDao;
import sn.ssi.togo.model.SygAvisGeneral;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygAvisGeneralController {
   @Autowired
   private ISygAvisGeneralDao sygAvisGeneralDao;

    //Récupérer tous les SygAvisGeneraux
   @GetMapping(value="avisgeneral")
   public List<SygAvisGeneral> listeSygAvisGeneraux(){

       return sygAvisGeneralDao.findAll();
   }

   //Récupérer un SygAvisGeneral par son Id
   @GetMapping(value= "/avisgeneral/{id}")
   public Optional <SygAvisGeneral> recupererSygAvisGeneralId(@PathVariable Long id) {
       Optional <SygAvisGeneral> avisgeneral =sygAvisGeneralDao.findById(id);

       return avisgeneral;
   }
    //Récupérer un SygAvisGeneral par son Numero
    @GetMapping(value= "/avisgeneral/numero/{numero}")
    public List<SygAvisGeneral> recupererSygAvisGeneralNumero(@PathVariable String numero) {
        List<SygAvisGeneral> avisgeneral =sygAvisGeneralDao.findByNumeroIgnoreCase(numero);

        return avisgeneral;
    }
    //Récupérer un SygAvisGeneral par son Numero
    @GetMapping(value= "/avisgeneral/annee/{annee}")
    public List<SygAvisGeneral> recupererSygAvisGeneralAnnee(@PathVariable String annee) {
        List<SygAvisGeneral> avisgeneral =sygAvisGeneralDao.findByAnneeIgnoreCase(annee);

        return avisgeneral;
    }
   //ajouter un SygAvisGeneral
   @PostMapping(value = "/avisgeneral")
   public void ajouterSygAvisGeneral(@RequestBody SygAvisGeneral sygAvisGeneral) {

       sygAvisGeneralDao.save(sygAvisGeneral);
    }

   /*modifier un SygAvisGeneral*/
   @PutMapping(value = "/avisgeneral")
   public void modifierSygavisgeneral(@Valid @RequestBody SygAvisGeneral sygAvisGeneral) {

       sygAvisGeneralDao.save(sygAvisGeneral);
   }




}
