package mk.ukim.finki.payment.service;

import mk.ukim.finki.payment.domain.models.Payment;
import mk.ukim.finki.payment.domain.models.PaymentId;
import mk.ukim.finki.sharedkernel.domain.financial.CreditCart;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface PaymentService {
    Optional<Payment> getPaymentById(PaymentId paymemtId);

    List<Payment> getAllPayments();

    Payment createPayment( String method, int total, Date transactionDate, CreditCart creditCart);

    void updatePayment(PaymentId paymentId);

    void deletePayment(PaymentId paymentId);
}