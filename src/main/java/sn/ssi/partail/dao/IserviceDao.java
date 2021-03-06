package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.ServiceModel;

@Repository
public interface IserviceDao extends JpaRepository<ServiceModel, Integer> {
    public ServiceModel findById(int id);

}
