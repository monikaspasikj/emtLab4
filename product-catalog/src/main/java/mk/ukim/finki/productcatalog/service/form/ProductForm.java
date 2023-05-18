package mk.ukim.finki.productcatalog.service.form;

import lombok.Data;
import mk.ukim.finki.sharedkernel.domain.financial.Money;

@Data
public class ProductForm {

    private String productName;
    private Money price;
    private int sales;
}

