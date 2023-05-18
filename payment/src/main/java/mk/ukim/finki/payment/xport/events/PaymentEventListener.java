package mk.ukim.finki.payment.xport.events;

import lombok.AllArgsConstructor;
import mk.ukim.finki.payment.domain.models.PaymentId;
import mk.ukim.finki.payment.service.PaymentService;
import mk.ukim.finki.sharedkernel.domain.config.TopicHolder;
import mk.ukim.finki.sharedkernel.domain.events.DomainEvent;
import mk.ukim.finki.sharedkernel.domain.events.payments.PaymentCreated;
import mk.ukim.finki.sharedkernel.domain.events.payments.PaymentDeleted;
import mk.ukim.finki.sharedkernel.domain.events.payments.PaymentUpdated;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PaymentEventListener {

    private final PaymentService paymentService;

    @KafkaListener(topics= TopicHolder.TOPIC_PAYMENT_CREATED, groupId = "payment")
    public void consumePaymentCreatedEvent(String jsonMessage) {
        try {
            PaymentCreated event = DomainEvent.fromJson(jsonMessage,PaymentCreated.class);
            paymentService.createPayment( event.getMethod(), event.getTotal(), event.getTransactionDate(), event.getCreditCart());
        } catch (Exception e){

        }

    }

    @KafkaListener(topics= TopicHolder.TOPIC_PAYMENT_UPDATED, groupId = "payment")
    public void consumePaymentUpdatedEvent(String jsonMessage) {
        try {
            PaymentUpdated event = DomainEvent.fromJson(jsonMessage,PaymentUpdated.class);
            paymentService.updatePayment(PaymentId.of(event.getPaymentId()));
        } catch (Exception e){
        }

    }

    @KafkaListener(topics= TopicHolder.TOPIC_PAYMENT_DELETED, groupId = "user")
    public void consumePaymentDeletedEvent(String jsonMessage) {
        try {
            PaymentDeleted event = DomainEvent.fromJson(jsonMessage,PaymentDeleted.class);
            paymentService.deletePayment(PaymentId.of(event.getPaymentId()));
        } catch (Exception e){

        }

    }
}