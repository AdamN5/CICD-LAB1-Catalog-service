package ie.atu.catalogservice.service;

import ie.atu.catalogservice.model.Product;
import ie.atu.catalogservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAll() {
        return repository.findAll();
    }

    public Product create(Product product) {
        product.setId(null);
        return repository.save(product);
    }
}
