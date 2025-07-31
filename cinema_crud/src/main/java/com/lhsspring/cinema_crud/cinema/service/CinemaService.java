package com.lhsspring.cinema_crud.cinema.service;

import com.lhsspring.cinema_crud.cinema.dto.CinemaDto;
import com.lhsspring.cinema_crud.cinema.dto.CinemaGenreDto;
import com.lhsspring.cinema_crud.genre.dto.GenreDto;
import com.lhsspring.cinema_crud.genre.service.GenreMybatisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CinemaService {
    @Autowired
    private CinemaMybatisMapper cinemaMybatisMapper;

    @Autowired
    private GenreMybatisMapper genreMybatisMapper;

    public void insertCinema(CinemaDto dto) {
        this.cinemaMybatisMapper.insertCinema(dto);
    }

    @Transactional
    public void insertCinemaWithGenre(CinemaGenreDto dto) {
        GenreDto genreDto = new GenreDto();
        genreDto.setName(dto.getGenre());

        CinemaDto cinemaDto = new CinemaDto();
        cinemaDto.setName(dto.getName());
        cinemaDto.setCasts(dto.getCasts());
        cinemaDto.setPlayTime(dto.getPlayTime());
        cinemaDto.setDescription(dto.getDescription());
        cinemaDto.setRestrictAge(dto.getRestrictAge());

        this.genreMybatisMapper.insert(genreDto);
        cinemaDto.setGenreId(genreDto.getId());

        this.cinemaMybatisMapper.insertCinema(cinemaDto);
        dto.setId(cinemaDto.getId());
    }

    public CinemaDto findById(Long id) {
        return this.cinemaMybatisMapper.findById(id);
    }

    public List<CinemaGenreDto> findByWhere() {
        return this.cinemaMybatisMapper.findByWhere();
    }

    public CinemaDto update(CinemaDto dto) {
        this.cinemaMybatisMapper.update(dto);
        return dto;
    }

    public void delete(Long id) {
        this.cinemaMybatisMapper.delete(id);
    }
}