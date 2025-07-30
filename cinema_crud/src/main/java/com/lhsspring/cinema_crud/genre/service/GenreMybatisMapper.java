package com.lhsspring.cinema_crud.genre.service;

import com.lhsspring.cinema_crud.genre.dto.GenreDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GenreMybatisMapper {
    public void insert(GenreDto dto);
}
