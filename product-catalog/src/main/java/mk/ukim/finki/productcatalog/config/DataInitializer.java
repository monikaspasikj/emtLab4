package mk.ukim.finki.productcatalog.config;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import mk.ukim.finki.productcatalog.domain.models.Product;
import mk.ukim.finki.productcatalog.domain.repository.ProductRepository;
import mk.ukim.finki.sharedkernel.domain.financial.Currency;
import mk.ukim.finki.sharedkernel.domain.financial.Money;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@AllArgsConstructor
public class DataInitializer {

    private final ProductRepository productRepository;

    @PostConstruct
    public void initData() {
        Product p1 = Product.build("Pizza", Money.valueOf(Currency.MKD,500), 10);
        Product p2 = Product.build("Ice Cream", Money.valueOf(Currency.MKD,100), 5);
        if (productRepository.findAll().isEmpty()) {
            productRepository.saveAll(Arrays.asList(p1,p2));
        }
    }
}
