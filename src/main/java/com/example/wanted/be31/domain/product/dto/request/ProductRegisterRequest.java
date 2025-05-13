package com.example.wanted.be31.domain.product.dto.request;

import com.example.wanted.be31.domain.product.dto.request.common.CategoryDto;
import com.example.wanted.be31.domain.product.dto.request.common.ProductImageDto;
import com.example.wanted.be31.domain.product.dto.request.common.ProductPriceDto;
import com.example.wanted.be31.domain.product.dto.request.common.detail.ProductDetailDto;
import com.example.wanted.be31.domain.product.dto.request.common.option.ProductOptionGroupDto;
import java.util.List;

public record ProductRegisterRequest(
        String name,
        String slug,
        String shortDescription,
        String fullDescription,
        Long sellerId,
        Long brandId,
        String status,
        ProductDetailDto detail,
        ProductPriceDto price,
        List<CategoryDto> categories,
        List<ProductOptionGroupDto> optionGroups,
        List<ProductImageDto> images,
        List<Long> tags
) {
}
