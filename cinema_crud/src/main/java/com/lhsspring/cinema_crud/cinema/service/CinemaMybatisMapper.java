package com.lhsspring.cinema_crud.cinema.service;

import com.lhsspring.cinema_crud.cinema.dto.CinemaDto;
import com.lhsspring.cinema_crud.cinema.dto.CinemaGenreDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CinemaMybatisMapper {
    public void insertCinema(CinemaDto dto);
    CinemaDto findById(Long id);
    List<CinemaGenreDto> findByWhere();
    public void update(CinemaDto dto);
    public void delete(Long id);
}
