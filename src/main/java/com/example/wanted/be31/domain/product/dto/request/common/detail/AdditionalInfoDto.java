package com.example.wanted.be31.domain.product.dto.request.common.detail;

public record AdditionalInfoDto(
        boolean assemblyRequired,
        String assemblyTime
) {
}
