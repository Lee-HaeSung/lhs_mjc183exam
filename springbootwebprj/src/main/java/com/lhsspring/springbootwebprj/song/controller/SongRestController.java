package com.lhsspring.springbootwebprj.song.controller;

import com.lhsspring.springbootwebprj.common.ResponseDto;
import com.lhsspring.springbootwebprj.song.dto.SongEntity;
import com.lhsspring.springbootwebprj.song.service.SongRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/song")
public class SongRestController {
    @Autowired
    private SongRepository songRepository;

    @PostMapping("")
    public ResponseEntity<ResponseDto> insert(@RequestBody SongEntity entity) {
        try {
            this.songRepository.save(entity);
            return ResponseEntity.ok().body(
                    ResponseDto.builder().resultCode(999).message("ERROR")
                            .resultData(entity).build()
            );
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR")
                            .resultData(entity).build()
            );
        }
    }

}
