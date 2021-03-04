package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.PosteModel;

@Repository
public interface IposteDao extends JpaRepository<PosteModel, Integer> {
    public PosteModel findById(int id);

}
