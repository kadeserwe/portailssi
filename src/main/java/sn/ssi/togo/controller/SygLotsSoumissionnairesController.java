package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygLotsSoumissionnairesDao;
import sn.ssi.togo.model.SygLotsSoumissionnaires;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygLotsSoumissionnairesController {

   @Autowired private ISygLotsSoumissionnairesDao sygLotsSoumissionnairesDao;
    

    //Récupérer tous les SygAvisAttributions
   @GetMapping(value="plots")
   public List<SygLotsSoumissionnaires> listeLotsSoumissionnaire(){

       return sygLotsSoumissionnairesDao.findAll();
   }

   //Récupérer un SygavisAttributions par son Id
   @GetMapping("/plots/{id}")
   public Optional <SygLotsSoumissionnaires> recupererSygLotsSoumi(@PathVariable Long id) {
       Optional <SygLotsSoumissionnaires> lotsSoumiss = sygLotsSoumissionnairesDao.findById(id);
       return lotsSoumiss;
   }

    //Récupérer un SygAttributions par referenceAvisGeneral
//    @GetMapping("/plots/prsociale/{plilraisonsociale}")
//    public List<SygLotsSoumissionnaires> recupererPlilraisonsociale(@PathVariable String plilraisonsociale) {
//        List<SygLotsSoumissionnaires> lotsSoum = sygLotsSoumissionnairesDao.findByPlilraisonsocialeCase(plilraisonsociale);
//        return lotsSoum;
//    }


    //ajouter un attributions
   @PostMapping("/plots")
   public void ajouterLotsSoumi(@RequestBody SygLotsSoumissionnaires sygLotsSoumissionnaires) {

       sygLotsSoumissionnairesDao.save(sygLotsSoumissionnaires);
    }

   /*modifier un SygAttributions*/
   @PutMapping( "/plots")
   public void modifierSygALotsSoumiss(@Valid @RequestBody SygLotsSoumissionnaires sygLotsSoumissionnaires) {

       sygLotsSoumissionnairesDao.save(sygLotsSoumissionnaires);
   }




}
