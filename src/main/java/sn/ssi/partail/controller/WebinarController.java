package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.IarticleDao;
import sn.ssi.partail.dao.IwebinarDao;
import sn.ssi.partail.model.ArticleModel;
import sn.ssi.partail.model.WebinarModel;

import java.util.List;

@RestController
public class WebinarController {
   @Autowired
   private IwebinarDao webinarDao;

    //Récupérer tous les webinars
   @GetMapping(value="webinar")
   public List<WebinarModel> listeWebinars(){

       return webinarDao.findAll();
   }

   //Récupérer un webinar par son Id
   @GetMapping(value="/webinar/{id}")
   public WebinarModel recupererWebinarId(@PathVariable int id) {
      return webinarDao.findById(id);
   }
   //ajouter un Webinar
   @PostMapping("/webinar")
   public void ajouterWebinar(@RequestBody WebinarModel webinarModel) {
       webinarDao.save(webinarModel);
    }

   /*modifier un Webinar*/
   @PutMapping(value = "/webinar")
   public void modifierWebinare(@RequestBody WebinarModel webinarModel) {
       webinarDao.save(webinarModel);
   }

  /* supprimer un webinar*/
   @DeleteMapping(value="/webinar/{id}")
   public void supprimerWebinar(@PathVariable int id) {
     if(id!=0){
        try {
            WebinarModel webinarModel = webinarDao.findById(id);
            webinarModel.setIsDeleted(1);
            webinarDao.save(webinarModel);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
