
package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.ssi.togo.model.SygAutoriteContractante;
import sn.ssi.togo.model.SygTypeAutoriteContractante;

import java.util.List;

@Repository
public interface ISygAutoriteContractanteDao extends JpaRepository<SygAutoriteContractante, Long> {
    public List<SygAutoriteContractante> findBySigleIgnoreCase(String sigle);


}

