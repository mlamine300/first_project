package com.lamine.first_project.services;

import com.lamine.first_project.model.dto.FruitsDto;
import com.lamine.first_project.model.entity.Fruits;
import com.lamine.first_project.model.reposetory.MyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class MyService {

    @Autowired
    MyRepo repo;

    public FruitsDto getTheFruit(Integer id){


        return FruitsDto.fromFruit(repo.findById(id).orElse(new Fruits()));
    }
    public FruitsDto saveTheFruit(FruitsDto f){
       return FruitsDto.fromFruit(repo.save(Fruits.toFruits(f)));
    }
    public FruitsDto UpdateTheFruit(FruitsDto f){
        return FruitsDto.fromFruit(repo.save(Fruits.toFruits(f)));
    }

    public void deleteTheFruit(Integer id) {
         repo.deleteById(id);
    }

    public List<FruitsDto> getAllFruits() {

        return repo.findAll().stream().map(FruitsDto.fromFruit).toList();
    }
}
