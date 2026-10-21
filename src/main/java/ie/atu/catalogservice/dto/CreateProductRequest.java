package ie.atu.catalogservice.dto;

import java.math.BigDecimal;

public record CreateProductRequest(
        String name,
        BigDecimal price,
        Long categoryId
) { }
