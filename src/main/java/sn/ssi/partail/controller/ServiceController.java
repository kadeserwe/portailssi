package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.IserviceDao;
import sn.ssi.partail.model.ServiceModel;

import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping(path = "/portail")
@RestController
public class ServiceController {
   @Autowired
   private IserviceDao serviceDao;

    //Récupérer tous les services
   @GetMapping(value="service")
   public List<ServiceModel> listeService(){

       return serviceDao.findAll();
   }

   //Récupérer un service par son Id
   @GetMapping(value="/service/{id}")
   public ServiceModel recupererserviceId(@PathVariable int id) {
      return serviceDao.findById(id);
   }
   //ajouter un service
   @PostMapping(value = "/service")
   public void ajouterService(@RequestBody ServiceModel service) {
       serviceDao.save(service);
    }

   /*modifier un produit*/
   @PutMapping(value = "/service")
   public void modifierService(@RequestBody ServiceModel service)
   {
      serviceDao.save(service);
   }

  /* supprimer un service*/
   @DeleteMapping(value="/service/{id}")
   public void supprimerService(@PathVariable int id) {
     if(id!=0){
        try {
           ServiceModel service = serviceDao.findById(id);
           service.setIsDeleted(1);
           serviceDao.save(service);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
