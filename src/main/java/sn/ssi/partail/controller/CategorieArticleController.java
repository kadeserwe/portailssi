package sn.ssi.partail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.ssi.partail.dao.IarticleDao;
import sn.ssi.partail.dao.IcategorieArticleDao;
import sn.ssi.partail.model.ArticleModel;
import sn.ssi.partail.model.CategorieArticleModel;
import sn.ssi.partail.model.SliderModel;

import java.util.List;

@RestController
public class CategorieArticleController {
   @Autowired
   private IcategorieArticleDao categorieArticleDao;

    //Récupérer tous les CategorieArticles
    @GetMapping(value="/categoriearticle")
    public List<CategorieArticleModel> listeCategorieArticles(){

        return categorieArticleDao.findAll();
    }

   //Récupérer un CategorieArticle par son Id
   @GetMapping(value="/categoriearticle/{id}")
   public CategorieArticleModel recupererCategorieArticleDaoId(@PathVariable int id) {
      return categorieArticleDao.findById(id);
   }
   //ajouter un CategorieArticle
   @PostMapping("/categoriearticle")
   public void ajouterCategorieArticle(@RequestBody CategorieArticleModel categorieArticleModel) {
       categorieArticleDao.save(categorieArticleModel);
    }

   /*modifier un CategorieArticle*/
   @PutMapping(value = "/categoriearticle")
   public void modifierCategorieArticle(@RequestBody CategorieArticleModel categorieArticleModel) {
       categorieArticleDao.save(categorieArticleModel);
   }

  /* supprimer un CategorieArticle*/
   @DeleteMapping(value="/categoriearticle/{id}")
   public void supprimerArticle(@PathVariable int id) {
     if(id!=0){
        try {
            CategorieArticleModel categorieArticleModel = categorieArticleDao.findById(id);
            categorieArticleModel.setIsDeleted(1);
            categorieArticleDao.save(categorieArticleModel);
        }catch (Exception e) {
           e.printStackTrace();
        }
     }

   }


}
