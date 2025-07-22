package com.lhsspring.mpacurd.animal.service;

import com.lhsspring.mpacurd.animal.dto.AnimalDto;
import com.lhsspring.mpacurd.animal.mybatis.AnimalMybatisMapper;
import com.lhsspring.mpacurd.animal.dto.AnimalDto;
import com.lhsspring.mpacurd.animal.mybatis.AnimalMybatisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// 클래스를 스프링프레임워크에서 자동 생성 가능한 서비스형 클래스로 만듬,  @Autowired 애노테이션 으로 객체 생성 가능
public class AnimalService {
    @Autowired  // 스프링프레임워크가 객체를 인스턴스(생성) 해준다.
    private AnimalMybatisMapper animalMybatisMapper;

    public void insert(AnimalDto dto) {
        this.animalMybatisMapper.insertAnimal(dto);
    }

    public List<AnimalDto> findAll() {
        List<AnimalDto> all = this.animalMybatisMapper.findAll();
        return all;
    }

    public AnimalDto findById(Long id) {
        return this.animalMybatisMapper.findById(id);
    }
}
