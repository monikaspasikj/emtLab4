package mk.ukim.finki.payment.xport.rest;

import lombok.AllArgsConstructor;
import mk.ukim.finki.payment.domain.models.Paymemt;
import mk.ukim.finki.payment.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
@AllArgsConstructor
public class PaymentResource {

    private final PaymentService paymentService;

    @GetMapping
    public List<Paymemt> getAllUsers() {
        return paymentService.getAllPayments();
    }
}