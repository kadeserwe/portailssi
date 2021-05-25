package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.ArticleModel;
import sn.ssi.partail.model.MessageModel;

@Repository
public interface IarticleDao extends JpaRepository<ArticleModel, Integer> {
    public ArticleModel findById(int id);

}
