package com.example.wanted.be31.domain.product.repository;

import com.example.wanted.be31.domain.product.entity.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {
}
