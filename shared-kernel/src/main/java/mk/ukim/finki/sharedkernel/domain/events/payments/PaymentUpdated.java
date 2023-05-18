package mk.ukim.finki.sharedkernel.domain.events.payments;

import lombok.Getter;
import mk.ukim.finki.sharedkernel.domain.config.TopicHolder;
import mk.ukim.finki.sharedkernel.domain.events.DomainEvent;
import mk.ukim.finki.sharedkernel.domain.financial.Money;

@Getter
public class PaymentUpdated extends DomainEvent {

    private String paymentId;
    private Money newAmount;

    public PaymentUpdated(String topic) {
        super(TopicHolder.TOPIC_PAYMENT_UPDATED);
    }

    public PaymentUpdated(String paymentId, Money newAmount) {
        super(TopicHolder.TOPIC_PAYMENT_UPDATED);
        this.paymentId = paymentId;
        this.newAmount = newAmount;
    }
}