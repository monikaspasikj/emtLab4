package mk.ukim.finki.ordermanagement.service.forms;

import lombok.Data;
import mk.ukim.finki.ordermanagement.domain.valueobjects.Product;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class OrderItemForm {

    @NotNull
    private Product product;

    @Min(1)
    private int quantity = 1;
}

