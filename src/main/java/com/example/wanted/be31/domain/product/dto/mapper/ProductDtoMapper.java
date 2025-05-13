package com.example.wanted.be31.domain.product.dto.mapper;

import com.example.wanted.be31.domain.product.dto.response.ProductRegisterResponse;
import com.example.wanted.be31.domain.product.entity.Product;

public class ProductDtoMapper {

    public static final ProductRegisterResponse toProductRegisterResponse(Product product) {
        return new ProductRegisterResponse(
                product.getId(),
                product.getName(),
                product.getSlug(),
                product.getCreatedAt(),
                product.getUpdatedAt()
        );
    }
}
