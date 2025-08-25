package com.lhsspring.song_project.genre.service;

import com.lhsspring.song_project.common.exception.MyRequestException;
import com.lhsspring.song_project.genre.dto.GenreDto;
import com.lhsspring.song_project.genre.dto.GenreEntity;
import com.lhsspring.song_project.genre.dto.IGenre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GenreService {
    @Autowired
    private GenreRepository genreRepository;

    //insert
    public IGenre insert(GenreDto dto){
        if(dto == null){
            return null;
        }
        GenreEntity entity = GenreEntity.builder()
                .id(dto.getId())
                .name(dto.getName()).build();
        this.genreRepository.save(entity);
        return entity;
    }

    //update
    public IGenre update(GenreDto dto){
        if(dto == null || dto.getId() == null) {
            throw new MyRequestException("parameter error");
        }
        Optional<GenreEntity> byId = this.genreRepository.findById(dto.getId());
        if(byId.isEmpty()){
            throw new MyDataNotFoundException(String.format("id[%d] can't found", dto.getId()));
        }
        GenreEntity entity = byId.get();
        entity.setName(dto.getName());

        this.genreRepository.save(entity);
        return entity;
    }

    //delete
    public IGenre deleteById(Long id){
        if(id == null){
            throw new MyRequestException("parameter error");
        }
        Optional<GenreEntity> byId = this.genreRepository.findById(id);
        if(byId.isEmpty()){
            throw new MyDataNotFoundException(String.format("id[%d] can't found", id));
        }
        this.genreRepository.deleteById(id);
        return byId.get();
    }

    public IGenre findById(Long id) {
        // dto 의 id 번호로 데이터 있어야지만 수정이 가능하다.
        if (id == null) {
            throw new MyRequestException("parameter error");
        }
        Optional<GenreEntity> byId = this.genreRepository.findById(id);
        if( byId.isEmpty() ) {
            throw new MyDataNotFoundException(String.format("id[%d] can't found", id));
        }
        return byId.get();
    }

    public Page<GenreEntity> findByNameContains(String name, Pageable pageable) {
        if (name == null || pageable == null) {
            throw new MyRequestException("parameter error");
        }
        Page<GenreEntity> list = this.genreRepository.findByNameContains(name, pageable);
        return list;
    }
}

