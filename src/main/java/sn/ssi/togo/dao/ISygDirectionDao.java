package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.togo.model.SygDirection;
import sn.ssi.togo.model.SygTypesmarches;

@Repository
public interface ISygDirectionDao extends JpaRepository<SygDirection, Long> {


}
