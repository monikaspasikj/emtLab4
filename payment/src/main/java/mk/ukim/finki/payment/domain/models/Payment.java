package mk.ukim.finki.payment.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import mk.ukim.finki.sharedkernel.domain.financial.CreditCart;
import mk.ukim.finki.sharedkernel.domain.base.AbstractEntity;

import java.util.Date;

@Entity
@Table(name = "payment")
@Getter
public class Payment extends AbstractEntity<PaymentId> {
    private String method;
    private int total;
    private Date transactionDate;
    private CreditCart creditCart;


    public Payment() {
        super(PaymentId.randomId(PaymentId.class));
    }

    public static Payment build(String method, int total, int i, Date transactionDate, CreditCart creditCart) {
        Payment paymemt = new Payment();
        paymemt.method=method;
        paymemt.total=total;
        paymemt.transactionDate=transactionDate;
        paymemt.creditCart=creditCart;
        return paymemt;
    }
}