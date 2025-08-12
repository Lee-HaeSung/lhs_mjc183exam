package com.lhsspring.springbootwebprj.genre.service;

import com.lhsspring.springbootwebprj.genre.dto.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<GenreEntity, Long> {
}