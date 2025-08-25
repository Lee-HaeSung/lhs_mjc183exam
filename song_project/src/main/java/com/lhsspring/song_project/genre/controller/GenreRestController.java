package com.lhsspring.song_project.genre.controller;

import com.lhsspring.song_project.common.CommonRestController;
import com.lhsspring.song_project.genre.service.GenreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/genre")
public class GenreRestController extends CommonRestController {
    @Autowired
    private GenreService genreService;

    @PostMapping("")
    public ResponseEntity<ResponseDto>
}
