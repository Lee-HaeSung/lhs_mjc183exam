package com.lhsspring.springbootwebprj.genre.controller;

import com.lhsspring.springbootwebprj.genre.dto.GenreEntity;
import com.lhsspring.springbootwebprj.genre.service.GenreRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/genre")
public class GenreController {
    @Autowired
    private GenreRepository genreRepository;

    @PostMapping
    public ResponseEntity<GenreEntity> insert(@RequestBody GenreEntity entity) {
        try{
            this.genreRepository.save(entity);
            return ResponseEntity.ok(entity);
        }catch(Throwable e){
            log.error(e.toString());
            return ResponseEntity.status(500).body(entity);
        }
    }
}
