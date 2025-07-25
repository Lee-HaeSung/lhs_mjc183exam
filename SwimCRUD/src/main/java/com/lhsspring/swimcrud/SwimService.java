package com.lhsspring.swimcrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SwimService {
    @Autowired
    private ISwimMybatis swimbatisMapper;

    public void addSwim(SwimDto obj){
        this.swimbatisMapper.addSwim(obj);
    }

    public List<SwimDto> findAll(){
        List<SwimDto> all = this.swimbatisMapper.findAll();
        return all;
    }

    public SwimDto findById(Long num){
        SwimDto byId = this.swimbatisMapper.findById(num);
        return byId;
    }

    public void update(SwimDto dto){
        this.swimbatisMapper.update(dto);
    }

    public void deleteById(Long id){
        this.swimbatisMapper.deleteById(id);
    }
}
