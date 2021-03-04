package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.ImessageServiceDao;
import sn.ssi.partail.dao.IserviceDao;
import sn.ssi.partail.model.MessageServiceModel;
import sn.ssi.partail.model.ServiceModel;

import java.util.List;

@RestController
public class MessageServiceController {
   @Autowired
   private ImessageServiceDao messageServiceDao;

    //Récupérer tous les MessageService
   @GetMapping(value="messageservice")
   public List<MessageServiceModel> listeMessageServices(){

       return messageServiceDao.findAll();
   }

   //Récupérer un MessageService par son Id
   @GetMapping(value="/messageservice/{id}")
   public MessageServiceModel recupererMessageServiceId(@PathVariable int id) {
      return messageServiceDao.findById(id);
   }
   //ajouter un MessageService
   @PostMapping(value = "/messageservice")
   public void ajouterMessageService(@RequestBody MessageServiceModel messageService) {
       messageServiceDao.save(messageService);
    }

   /*modifier un MessageService*/
   @PutMapping(value = "/messageservice")
   public void modifierMessageService(@RequestBody MessageServiceModel messageService)
   {
       messageServiceDao.save(messageService);
   }

  /* supprimer un messageService*/
   @DeleteMapping(value="/messageservice/{id}")
   public void supprimerMessageService(@PathVariable int id) {
     if(id!=0){
        try {
            MessageServiceModel messageService = messageServiceDao.findById(id);
            messageService.setIsDeleted(1);
            messageServiceDao.save(messageService);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
