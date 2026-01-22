package sn.ssi.togo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.togo.model.SygCategori;
import sn.ssi.togo.model.SygTypesmarches;

@Repository
public interface ISygCategoriDao extends JpaRepository<SygCategori, Integer> {
    public SygCategori findById(Long id);

}
