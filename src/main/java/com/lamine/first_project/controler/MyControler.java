package com.lamine.first_project.controler;

import com.lamine.first_project.model.dto.FruitsDto;
import com.lamine.first_project.model.entity.Fruits;
import com.lamine.first_project.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyControler {
    @Autowired
    MyService ms;

@GetMapping(path = "/get_allfruits")
private List<FruitsDto>getAllFruits(){
    return ms.getAllFruits();
}

    @GetMapping(path = "/get_fruit")
    private FruitsDto GetFruits(@RequestParam Integer id){

        return ms.getTheFruit(id);
    }
    @PostMapping(path = "/save_fruit")
    private FruitsDto SaveFruits(@RequestBody FruitsDto fruits){
//System.out.println(fruits.getName());
        return ms.saveTheFruit(fruits);
    }
    @PostMapping(path = "/update_fruit")
    private FruitsDto UpdateFruits(@RequestBody FruitsDto fruits){
//System.out.println(fruits.getName());
        return ms.UpdateTheFruit(fruits);
    }
    @DeleteMapping(path = "/delete_fruit")
    private void DeleteFruits(@RequestParam Integer id){

         ms.deleteTheFruit(id);
    }
}
