package mk.ukim.finki.payment.service.forms;

import lombok.Data;
import mk.ukim.finki.sharedkernel.domain.financial.CreditCart;

import java.util.Date;

@Data
public class PaymentForms {
    private String method;
    private int total;
    private Date transactionDate;
    private CreditCart creditCart;
}