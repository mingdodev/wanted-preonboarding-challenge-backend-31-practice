package com.example.wanted.be31.domain.product.repository;

import com.example.wanted.be31.domain.product.entity.ProductOption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOptionRepository extends JpaRepository<ProductOption, Long> {
}
