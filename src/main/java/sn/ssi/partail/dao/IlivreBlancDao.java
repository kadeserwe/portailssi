package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.CategorieArticleModel;
import sn.ssi.partail.model.LivreBlancModel;

@Repository
public interface IlivreBlancDao extends JpaRepository<LivreBlancModel, Integer> {
    public LivreBlancModel findById(int id);

}
