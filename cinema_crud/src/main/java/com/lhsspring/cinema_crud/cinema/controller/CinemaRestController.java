package com.lhsspring.cinema_crud.cinema.controller;

import com.lhsspring.cinema_crud.cinema.dto.CinemaDto;
import com.lhsspring.cinema_crud.cinema.dto.CinemaGenreDto;
import com.lhsspring.cinema_crud.cinema.service.CinemaService;
import com.lhsspring.cinema_crud.common.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/cinema")
public class CinemaRestController {
    @Autowired
    private CinemaService cinemaService;

    @PostMapping("")
    public ResponseEntity<ResponseDto> insertCinema(@Validated @RequestBody CinemaDto dto) {
        try {
            this.cinemaService.insertCinema(dto);
            return ResponseEntity.ok().body(
                    new ResponseDto("ok", 50010, dto)
            );
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.ok().body(
                    new ResponseDto("insert error", 90000, dto)
            );
        }
    }

    @PostMapping("/genre")
    public ResponseEntity<ResponseDto> insert2Genre(@RequestBody CinemaGenreDto dto) {
        try {
            this.cinemaService.insertCinemaWithGento(dto);
            return ResponseEntity.ok().body(
                    new ResponseDto("ok", 50010, dto)
            );
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.ok().body(
                    new ResponseDto("insert error", 90000, dto)
            );
        }
    }
}
