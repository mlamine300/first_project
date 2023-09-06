package com.lamine.first_project.model.dto;


import com.lamine.first_project.model.entity.Fruits;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.function.Function;


@Builder
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FruitsDto {
  private   Integer Id;
    private  String name;
    private Double price;

    public static FruitsDto fromFruit(Fruits f){
        return FruitsDto.builder().Id(f.getId()).name(f.getName()).price(f.getPrice()).build();
    }
  public static Function<Fruits,FruitsDto>fromFruit=(f)->{
      return FruitsDto.builder().Id(f.getId()).name(f.getName()).price(f.getPrice()).build();
    };

}
