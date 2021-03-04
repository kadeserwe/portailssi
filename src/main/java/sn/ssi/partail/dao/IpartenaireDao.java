package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.PartenaireModel;

@Repository
public interface IpartenaireDao extends JpaRepository<PartenaireModel, Integer> {
    public PartenaireModel findById(int id);

}
