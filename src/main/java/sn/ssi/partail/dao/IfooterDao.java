package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.FooterModel;

@Repository
public interface IfooterDao extends JpaRepository<FooterModel, Integer> {
    public FooterModel findById(int id);

}
