package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.ssi.togo.model.SygAvisGeneral;
import sn.ssi.togo.model.SygTypesmarches;

import java.util.List;

@Repository
public interface ISygAvisGeneralDao extends JpaRepository<SygAvisGeneral, Long> {
    public List<SygAvisGeneral> findByNumeroIgnoreCase(String numero);
    public List<SygAvisGeneral> findByAnneeIgnoreCase(String annee);


}
