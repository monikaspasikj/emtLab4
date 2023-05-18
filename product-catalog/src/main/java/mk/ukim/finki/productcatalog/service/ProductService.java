package mk.ukim.finki.productcatalog.service;

import mk.ukim.finki.productcatalog.domain.models.Product;
import mk.ukim.finki.productcatalog.domain.models.ProductId;
import mk.ukim.finki.productcatalog.service.form.ProductForm;

import java.util.List;

public interface ProductService {
    Product findById(ProductId id);
    Product createProduct(ProductForm form);
    Product orderItemCreated(ProductId productId, int quantity);
    Product orderItemRemoved(ProductId productId, int quantity);
    List<Product> getAll();

}
