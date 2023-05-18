package mk.ukim.finki.payment.service.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import mk.ukim.finki.payment.domain.exception.PaymentNotFoundException;
import mk.ukim.finki.payment.domain.models.Payment;
import mk.ukim.finki.payment.domain.models.PaymentId;
import mk.ukim.finki.payment.domain.repository.PaymentRepository;
import mk.ukim.finki.sharedkernel.domain.financial.CreditCart;
import mk.ukim.finki.payment.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;

    @Override
    public Optional<Payment> getPaymentById(PaymentId paymentId) {
        return paymentRepository.findById(paymentId);
    }


    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment createPayment(String method, int total, Date transactionDate, CreditCart creditCart) {
        Payment payment = Payment.build(method, total, total, transactionDate, creditCart);
        return paymentRepository.save(payment);
    }

    @Override
    public void updatePayment(PaymentId paymentId) {
        Payment paymemt1=paymentRepository.findById(paymentId).orElseThrow(PaymentNotFoundException::new);
        paymentRepository.save(paymemt1);
    }



    @Override
    public void deletePayment(PaymentId paymentId) {
        paymentRepository.deleteById(paymentId);
    }


}