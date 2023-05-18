package mk.ukim.finki.sharedkernel.domain.events.clients;

import lombok.Getter;
import mk.ukim.finki.sharedkernel.domain.config.TopicHolder;
import mk.ukim.finki.sharedkernel.domain.events.DomainEvent;

@Getter
public class ClientUpdated extends DomainEvent {
    private String userId;
    private String updatedName;

    public ClientUpdated(String topic) {
        super(TopicHolder.TOPIC_CLIENT_UPDATED);
    }

    public ClientUpdated(String userId, String updatedName) {
        super(TopicHolder.TOPIC_CLIENT_UPDATED);
        this.userId = userId;
        this.updatedName = updatedName;
    }
}