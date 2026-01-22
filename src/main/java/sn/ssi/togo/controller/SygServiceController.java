package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygServiceDao;
import sn.ssi.togo.model.SygPlansdepassation;
import sn.ssi.togo.model.SygService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygServiceController {
   @Autowired
   private ISygServiceDao sygServiceDao;

    //Récupérer tous les SygService
   @GetMapping(value="service")
   public List<SygService> listeSygService(){

       return sygServiceDao.findAll();
   }

   //Récupérer un SygService par son Id
   @GetMapping(value= "/service/{id}")
   public Optional<SygService> recupererSygServiceId(@PathVariable Long id) { return sygServiceDao.findById(id);
   }

    //Récupérer un Sygpays par son Num Plan
    @GetMapping("/service/codif/{codification}")
    public List<SygService> recupererSygServiceCodification(@PathVariable String codification) {
        List<SygService> servicecodif = sygServiceDao.findByCodificationIgnoreCase(codification);
        return servicecodif;
    }
   //ajouter un Service
   @PostMapping(value = "/service")
   public void ajouterSygService(@RequestBody SygService sygService) {

       sygServiceDao.save(sygService);
    }

   /*modifier un SygService*/
   @PutMapping(value = "/service")
   public void modifierSygService(@Valid @RequestBody SygService sygService) {

       sygServiceDao.save(sygService);
   }




}
