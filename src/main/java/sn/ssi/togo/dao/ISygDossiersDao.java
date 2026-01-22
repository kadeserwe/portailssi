
package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.togo.model.SygDossiers;
import sn.ssi.togo.model.SygTypesmarches;

import java.util.List;

@Repository
public interface ISygDossiersDao extends JpaRepository<SygDossiers, Long> {
    public List<SygDossiers> findByDosReference(String dosReference);


}

