package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.CandidatureModel;

@Repository
public interface IcandidatureDao extends JpaRepository<CandidatureModel, Integer> {
    public CandidatureModel findById(int id);

}
