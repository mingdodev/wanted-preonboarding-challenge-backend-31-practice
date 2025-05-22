package com.example.wanted.be31.domain.product.repository;

import com.example.wanted.be31.domain.product.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
