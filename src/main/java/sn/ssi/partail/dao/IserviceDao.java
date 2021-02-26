package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.Service;

@Repository
public interface IserviceDao extends JpaRepository<Service, Integer> {
    public Service findById(int id);

}
