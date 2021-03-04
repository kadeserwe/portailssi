package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.MessageServiceModel;
import sn.ssi.partail.model.ServiceModel;

@Repository
public interface ImessageServiceDao extends JpaRepository<MessageServiceModel, Integer> {
    public MessageServiceModel findById(int id);

}
