package mk.ukim.finki.sharedkernel.domain.events.orders;

import lombok.Getter;
import mk.ukim.finki.sharedkernel.domain.config.TopicHolder;
import mk.ukim.finki.sharedkernel.domain.events.DomainEvent;

@Getter
public class OrderItemRemoved extends DomainEvent {

    private String productId;
    private int quantity;

    public OrderItemRemoved(String topic) {
        super(TopicHolder.TOPIC_ORDER_ITEM_REMOVED);
    }

    public OrderItemRemoved(String topic, String productId, int quantity) {
        super(TopicHolder.TOPIC_ORDER_ITEM_REMOVED);
        this.productId = productId;
        this.quantity = quantity;
    }
}