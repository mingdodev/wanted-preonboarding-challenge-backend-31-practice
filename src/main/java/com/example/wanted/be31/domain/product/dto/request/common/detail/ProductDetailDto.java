package com.example.wanted.be31.domain.product.dto.request.common.detail;

import java.math.BigDecimal;

public record ProductDetailDto(
        BigDecimal weight,
        DimensionsDto dimensions,
        String materials,
        String countryOfOrigin,
        String warrantyInfo,
        String careInstructions,
        AdditionalInfoDto additionalInfo
) {
}
