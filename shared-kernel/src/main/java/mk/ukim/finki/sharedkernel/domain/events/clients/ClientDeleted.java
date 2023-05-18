package mk.ukim.finki.sharedkernel.domain.events.clients;

import lombok.Getter;
import mk.ukim.finki.sharedkernel.domain.config.TopicHolder;
import mk.ukim.finki.sharedkernel.domain.events.DomainEvent;

@Getter
public class ClientDeleted extends DomainEvent {
    private String userId;
    private String name;

    public ClientDeleted(String topic) {
        super(TopicHolder.TOPIC_CLIENT_DELETED);
    }
    public ClientDeleted(String userId, String name) {
        super(TopicHolder.TOPIC_CLIENT_DELETED);
        this.userId = userId;
        this.name = name;
    }
}
