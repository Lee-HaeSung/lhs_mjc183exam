package com.lhsspring.swimcrud;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ISwimMybatis {
    public void addSwim(SwimDto obj);
    public List<SwimDto> findAll();
    public SwimDto findById(Long id);
    public void update(SwimDto dto);
    public void deleteById(Long id);
}
