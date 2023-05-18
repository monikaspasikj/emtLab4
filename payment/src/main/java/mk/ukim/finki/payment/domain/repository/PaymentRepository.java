package mk.ukim.finki.payment.domain.repository;

import mk.ukim.finki.payment.domain.models.Payment;
import mk.ukim.finki.payment.domain.models.PaymentId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, PaymentId> {
}
