package sn.ssi.togo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.togo.dao.ISygServiceDao;
import sn.ssi.togo.dao.ISygTypeServiceDao;
import sn.ssi.togo.model.SygService;
import sn.ssi.togo.model.SygTypeService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SygTypeServiceController {
   @Autowired
   private ISygTypeServiceDao sygTypeServiceDao;

    //Récupérer tous les SygTypeService
   @GetMapping(value="typeservice")
   public List<SygTypeService> listeSygTypeService(){

       return sygTypeServiceDao.findAll();
   }

   //Récupérer un SygtypeService par son Id
   @GetMapping(value= "/typeservice/{id}")
   public Optional  <SygTypeService> recupererSygTypeServiceId(@PathVariable Long id) {
       Optional  <SygTypeService>  TypeService = sygTypeServiceDao.findById(id);
       return TypeService;
   }
   //ajouter un typeService
   @PostMapping(value = "/typeservice")
   public void ajouterSygTypeService(@RequestBody SygTypeService sygTypeService) {

       sygTypeServiceDao.save(sygTypeService);
    }

   /*modifier un SygtypeService*/
   @PutMapping(value = "/typeservice")
   public void modifierSygTypeService(@Valid @RequestBody SygTypeService sygTypeService) {

       sygTypeServiceDao.save(sygTypeService);
   }




}
