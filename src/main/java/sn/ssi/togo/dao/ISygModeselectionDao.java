package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.togo.model.SygModepassation;
import sn.ssi.togo.model.SygModeselection;
import sn.ssi.togo.model.SygTypesmarches;

import java.util.List;

@Repository
public interface ISygModeselectionDao extends JpaRepository<SygModeselection, Long> {
    //public SygModeselection findById(Long id);
    public List<SygModeselection> findByCodeIgnoreCase(String code);

}
