
package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygAutoriteContractanteDao;
import sn.ssi.togo.dao.ISygTypeAutoriteContractanteDao;

import sn.ssi.togo.model.SygAutoriteContractante;
import sn.ssi.togo.model.SygTypeAutoriteContractante;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygAutoriteContractanteController {
   @Autowired
   private ISygAutoriteContractanteDao sygAutoriteContractanteDao;

    //Récupérer tous les autoritesContractante
   @GetMapping(value="autorite")
   public List<SygAutoriteContractante> listeSygAutoriteContractantes(){

       return sygAutoriteContractanteDao.findAll();
   }

   //Récupérer un autoritesContractante par son Id
   @GetMapping(value="/autorite/{id}")
   public Optional <SygAutoriteContractante> recupererSygAutoriteContractanteId(@PathVariable Long id) {
       Optional <SygAutoriteContractante> autorite = sygAutoriteContractanteDao.findById(id);
       return autorite ;
   }

    @GetMapping("/autorite/sigle/{sigle}")
    public List<SygAutoriteContractante> recupererBanqueDaoIdReference(@PathVariable String sigle) {
        List<SygAutoriteContractante> autoriteSigle = sygAutoriteContractanteDao.findBySigleIgnoreCase(sigle);
        return autoriteSigle;
    }
   //ajouter un autoritesContractante
   @PostMapping(value = "/autorite")
   public void ajouterSygAutoriteContractante(@RequestBody SygAutoriteContractante sygAutoriteContractante) {
       sygAutoriteContractanteDao.save(sygAutoriteContractante);
    }


/*modifier un autorite*/

   @PutMapping(value = "/autorite")
   public void modifierSygAutoriteContractante(@Valid @RequestBody SygAutoriteContractante sygAutoriteContractante) {

       sygAutoriteContractanteDao.save(sygAutoriteContractante);
   }



   }




