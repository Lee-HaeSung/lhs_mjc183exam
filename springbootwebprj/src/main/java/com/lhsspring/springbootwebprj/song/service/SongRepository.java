package com.lhsspring.springbootwebprj.song.service;

import com.lhsspring.springbootwebprj.song.dto.SongEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<SongEntity, Long> {
}
