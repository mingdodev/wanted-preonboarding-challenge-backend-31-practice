package com.example.wanted.be31.domain.product.dto.response;

import java.time.LocalDateTime;

public record ProductRegisterResponse(
        Long id,
        String name,
        String slug,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
