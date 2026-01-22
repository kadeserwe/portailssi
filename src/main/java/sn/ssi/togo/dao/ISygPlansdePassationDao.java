package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.togo.model.SygPays;
import sn.ssi.togo.model.SygPlansdepassation;
import sn.ssi.togo.model.SygTypeAutoriteContractante;

import java.util.List;

@Repository
public interface ISygPlansdePassationDao extends JpaRepository<SygPlansdepassation, Long> {
    //public SygPlansdepassation findById(int id);
    public List<SygPlansdepassation> findByNumplanIgnoreCase(String numPlan);

}
