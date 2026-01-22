package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.togo.model.SygModeselection;
import sn.ssi.togo.model.SygTypeAutoriteContractante;

import java.util.List;

@Repository
public interface ISygTypeAutoriteContractanteDao extends JpaRepository<SygTypeAutoriteContractante, Long> {
   // public SygTypeAutoriteContractante findById(int id);
    public List<SygTypeAutoriteContractante> findByCodeIgnoreCase(String code);

}
