package ie.atu.catalogservice.repository;

import ie.atu.catalogservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository
        extends JpaRepository<Product, Long>
{
    @Query("SELECT p FROM Product p WHERE p.price >= :minprice ORDER BY p.price ASC ")
    List<Product> findByMinimumPrice(@Param("minprice") BigDecimal minPrice);
}
