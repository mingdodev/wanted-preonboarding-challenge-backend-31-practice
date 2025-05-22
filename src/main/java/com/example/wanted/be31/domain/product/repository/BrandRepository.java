package com.example.wanted.be31.domain.product.repository;

import com.example.wanted.be31.domain.product.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
