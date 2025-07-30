package com.lhsspring.cinema_crud.cinema.service;

import com.lhsspring.cinema_crud.cinema.dto.CinemaDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CinemaMybatisMapper {
    public void insertCinema(CinemaDto dto);
}
