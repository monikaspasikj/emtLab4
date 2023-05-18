package mk.ukim.finki.sharedkernel.domain.events.payments;

import lombok.Getter;
import mk.ukim.finki.sharedkernel.domain.config.TopicHolder;
import mk.ukim.finki.sharedkernel.domain.events.DomainEvent;
import mk.ukim.finki.sharedkernel.domain.financial.CreditCart;
import mk.ukim.finki.sharedkernel.domain.financial.Money;

import java.util.Date;

@Getter
public class PaymentCreated extends DomainEvent {

    private String paymentId;

    private String method;
    private int total;
    private Date transactionDate;
    private CreditCart creditCart;

    public PaymentCreated(String topic) {
        super(TopicHolder.TOPIC_PAYMENT_CREATED);
    }

    public PaymentCreated(String paymentId, String method, int total, Date transactionDate, CreditCart creditCart) {
        super(TopicHolder.TOPIC_PAYMENT_CREATED);
        this.paymentId = paymentId;
        this.method=method;
        this.total=total;
        this.transactionDate=transactionDate;
        this.creditCart=creditCart;
    }

    public PaymentCreated of(String paymentId, String method, int total, Date transactionDate, CreditCart creditCart) {
       return new PaymentCreated(paymentId, method, total, transactionDate, creditCart);
    }
}
