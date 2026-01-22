package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.togo.model.SygService;
import sn.ssi.togo.model.SygTypeService;

import java.util.Optional;

@Repository
public interface ISygTypeServiceDao extends JpaRepository<SygTypeService, Long> {


}
