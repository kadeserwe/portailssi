package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.ImessageDao;
import sn.ssi.partail.dao.IserviceDao;
import sn.ssi.partail.model.MessageModel;
import sn.ssi.partail.model.ServiceModel;

import java.util.List;

@RestController
public class MessageController {
   @Autowired
   private ImessageDao messageDao;

    //Récupérer tous les Message
   @GetMapping(value="message")
   public List<MessageModel> listeMessages(){

       return messageDao.findAll();
   }

   //Récupérer un Message par son Id
   @GetMapping(value="/message/{id}")
   public MessageModel recupererMessageId(@PathVariable int id) {
      return messageDao.findById(id);
   }
   //ajouter un Message
   @PostMapping(value = "/message")
   public void ajouterMessage(@RequestBody MessageModel message) {
       messageDao.save(message);
    }

   /*modifier un Message*/
   @PutMapping(value = "/message")
   public void modifierService(@RequestBody MessageModel message)
   {
       messageDao.save(message);
   }

  /* supprimer un message*/
   @DeleteMapping(value="/message/{id}")
   public void supprimerMessage(@PathVariable int id) {
     if(id!=0){
        try {
            MessageModel message = messageDao.findById(id);
            message.setIsDeleted(1);
            messageDao.save(message);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
