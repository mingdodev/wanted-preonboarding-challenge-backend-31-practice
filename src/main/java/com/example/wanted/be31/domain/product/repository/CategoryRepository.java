package com.example.wanted.be31.domain.product.repository;

import com.example.wanted.be31.domain.product.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
