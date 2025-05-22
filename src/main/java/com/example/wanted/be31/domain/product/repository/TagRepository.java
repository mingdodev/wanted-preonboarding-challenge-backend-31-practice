package com.example.wanted.be31.domain.product.repository;

import com.example.wanted.be31.domain.product.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
