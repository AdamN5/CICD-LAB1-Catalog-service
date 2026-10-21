package ie.atu.catalogservice.controller;

import ie.atu.catalogservice.dto.CreateProductRequest;
import ie.atu.catalogservice.model.Product;
import ie.atu.catalogservice.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@RequestBody CreateProductRequest request) {
        return service.createProduct(request);
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/min-price")
    public List<Product> getByMinPrice(@RequestParam("price") BigDecimal price) {
        return service.getByMinPrice(price);
    }

    @GetMapping("/by-category")
    public List<Product> getByCategory(@RequestParam("name") String categoryName) {
        return service.getByCategoryName(categoryName);
    }
}