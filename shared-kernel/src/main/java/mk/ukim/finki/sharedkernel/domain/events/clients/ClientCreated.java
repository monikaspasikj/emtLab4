package mk.ukim.finki.sharedkernel.domain.events.clients;

import lombok.Getter;
import mk.ukim.finki.sharedkernel.domain.address.Address;
import mk.ukim.finki.sharedkernel.domain.config.TopicHolder;
import mk.ukim.finki.sharedkernel.domain.events.DomainEvent;

@Getter
public class ClientCreated extends DomainEvent {

    private String userId;
    private String name;
    private int embg;
    private String phoneNumber;
    private String email;
    private Address address;

    public ClientCreated(String topic) {
        super(TopicHolder.TOPIC_CLIENT_CREATED);
    }

    public ClientCreated(String userId, String name, int embg, String phoneNumber, String email, Address address) {
        super(TopicHolder.TOPIC_CLIENT_CREATED);
        this.userId = userId;
        this.name = name;
        this.embg = embg;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }
}