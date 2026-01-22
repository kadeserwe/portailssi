package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.togo.model.SygPoledcmp;

@Repository
public interface ISygPoledcmpDao extends JpaRepository<SygPoledcmp, Integer> {
    public SygPoledcmp findById(int id);

}
