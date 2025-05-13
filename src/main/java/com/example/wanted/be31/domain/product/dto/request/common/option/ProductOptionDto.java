package com.example.wanted.be31.domain.product.dto.request.common.option;

public record ProductOptionDto(
        String name,
        int additionalPrice,
        String sku,
        int stock,
        int displayOrder
) {}
