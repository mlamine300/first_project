package com.lamine.first_project.model.reposetory;

import com.lamine.first_project.model.entity.Fruits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepo extends JpaRepository<Fruits,Integer> {

}
