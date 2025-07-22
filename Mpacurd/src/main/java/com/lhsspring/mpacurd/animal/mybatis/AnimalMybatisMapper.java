package com.lhsspring.mpacurd.animal.mybatis;

import com.lhsspring.mpacurd.animal.dto.AnimalDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnimalMybatisMapper {
    public void insertAnimal(AnimalDto animalDto);
    public List<AnimalDto> findAll();
    public AnimalDto findById(Long id);
}