package com.example.wanted.be31.domain.product.dto.request.common;

public record ProductImageDto(
        String url,
        String altText,
        boolean isPrimary,
        int displayOrder,
        Long optionId
) {
}
