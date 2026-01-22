package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.togo.model.SygContrats;

import java.util.List;

@Repository
public interface ISygContratsDao extends JpaRepository<SygContrats, Long> {
  //  public List<SygContrats> findByContratsIgnoreCase(Long conID);


}
