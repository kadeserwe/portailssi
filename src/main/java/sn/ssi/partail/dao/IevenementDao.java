package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.EvenementModel;

@Repository
public interface IevenementDao extends JpaRepository<EvenementModel, Integer> {
    public EvenementModel findById(int id);

}
