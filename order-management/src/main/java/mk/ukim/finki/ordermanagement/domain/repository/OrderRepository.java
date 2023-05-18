package mk.ukim.finki.ordermanagement.domain.repository;

import lombok.Data;
import mk.ukim.finki.ordermanagement.domain.models.Order;
import mk.ukim.finki.ordermanagement.domain.models.OrderId;
import mk.ukim.finki.sharedkernel.domain.financial.Currency;
import org.springframework.data.jpa.repository.JpaRepository;



public interface OrderRepository extends JpaRepository<Order, OrderId> {
}

