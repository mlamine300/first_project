package com.lamine.first_project.model.entity;


import com.lamine.first_project.model.dto.FruitsDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="fruits")
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fruits {

    @Column( name = "fruit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    @Column(name = "fruit_name")
    private String name;
    @Column(name = "fruit_price")
    private Double price;

    public static Fruits toFruits(FruitsDto f){
        return Fruits.builder().id(f.getId()).name(f.getName()).price(f.getPrice()).build();
    }
}
