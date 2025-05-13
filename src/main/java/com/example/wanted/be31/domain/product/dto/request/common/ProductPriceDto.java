package com.example.wanted.be31.domain.product.dto.request.common;

public record ProductPriceDto(
        int basePrice,
        int salePrice,
        int costPrice,
        String currency,
        int taxRate
) {}
