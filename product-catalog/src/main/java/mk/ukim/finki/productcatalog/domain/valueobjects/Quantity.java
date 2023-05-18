package mk.ukim.finki.productcatalog.domain.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import mk.ukim.finki.sharedkernel.domain.base.ValueObject;

@Embeddable
@Getter
public class Quantity implements ValueObject {

    private final int quantity;

    protected Quantity() {
        this.quantity = 0;
    }

}
