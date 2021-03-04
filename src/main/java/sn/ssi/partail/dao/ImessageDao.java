package sn.ssi.partail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ssi.partail.model.MessageModel;
import sn.ssi.partail.model.ServiceModel;

@Repository
public interface ImessageDao extends JpaRepository<MessageModel, Integer> {
    public MessageModel findById(int id);

}
