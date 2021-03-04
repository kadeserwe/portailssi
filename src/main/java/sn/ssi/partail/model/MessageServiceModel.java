package sn.ssi.partail.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "messageservice")
public class MessageServiceModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private  int id;
    private MessageModel message;
    private ServiceModel service;
    private int isDeleted;
    public MessageServiceModel() {
    }
    public MessageServiceModel(int id, ServiceModel service, MessageModel message, int isDeleted) {
        this.id = id;
        this.service = service;
        this.message= message;
        this.isDeleted=isDeleted;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MessageModel getMessage() {
        return message;
    }

    public void setMessage(MessageModel message) {
        this.message = message;
    }

    public ServiceModel getService() {
        return service;
    }

    public void setService(ServiceModel service) {
        this.service = service;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "Footer{" +
                "id=" + id +
                ", service='" + message + '\'' +
                ", service='" + service + '\'' +
                ",isDeleted=" + isDeleted +
                '}';

    }
}
