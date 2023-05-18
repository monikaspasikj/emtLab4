package mk.ukim.finki.sharedkernel.infra;

import mk.ukim.finki.sharedkernel.domain.events.DomainEvent;
import org.springframework.data.domain.DomainEvents;

public interface DomainEventPublisher {
    void publish(DomainEvent event);
}
