package mk.ukim.finki.ordermanagement.domain.valueobjects;

import jakarta.persistence.Embeddable;
import mk.ukim.finki.sharedkernel.domain.base.DomainObjectId;

@Embeddable
public class ProductId extends DomainObjectId {

    private ProductId() {
        super(ProductId.randomId(ProductId.class).getId());
    }

    public ProductId(String uuid) {
        super(uuid);
    }


}
