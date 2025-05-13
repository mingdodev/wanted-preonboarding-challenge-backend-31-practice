package com.example.wanted.be31.domain.product.controller;

import com.example.wanted.be31.domain.product.dto.request.ProductRegisterRequest;
import com.example.wanted.be31.domain.product.dto.response.ProductRegisterResponse;
import com.example.wanted.be31.domain.product.service.ProductService;
import com.example.wanted.be31.global.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products/")
public class ProductController {

    private final ProductService productService;

    // POST /api/products: 상품 등록 (관련 정보 모두 포함)
    @PostMapping("")
    public ApiResponse<ProductRegisterResponse> register(@RequestBody ProductRegisterRequest request) {
        return ApiResponse.success(productService.register(request),
                "상품이 성공적으로 등록되었습니다.");
    }
    // PUT /api/products/{id}: 상품 수정z4
    // DELETE /api/products/{id}: 상품 삭제

    // POST /api/products/{id}/options: 상품 옵션 추가
    // PUT /api/products/{id}/options/{optionId}: 상품 옵션 수정
    // DELETE /api/products/{id}/options/{optionId}: 상품 옵션 삭제

    // POST /api/products/{id}/images: 상품 이미지 추가

}
