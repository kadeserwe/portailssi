package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.ssi.togo.model.SygTypeAutoriteContractante;
import sn.ssi.togo.model.SygTypesmarches;

import java.util.List;

@Repository
public interface ISygTypesmarchesDao extends JpaRepository<SygTypesmarches, Long> {
    public List<SygTypesmarches> findByCodeIgnoreCase(String code);


}
