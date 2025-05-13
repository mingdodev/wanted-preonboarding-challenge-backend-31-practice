package com.example.wanted.be31.domain.product.dto.request.common.option;

import java.util.List;

public record ProductOptionGroupDto(
        String name,
        int displayOrder,
        List<ProductOptionDto> options
) {}
