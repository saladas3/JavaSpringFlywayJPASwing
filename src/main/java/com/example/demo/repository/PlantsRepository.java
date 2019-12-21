package com.example.demo.repository;

import com.example.demo.entities.Plants;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantsRepository extends CrudRepository<Plants, Long> {
    @Query("SELECT p.plant_name FROM Plants p JOIN Plants_Characteristics pc ON p.plant_id = pc.plant_id WHERE pc.characteristic_id = :id")
    String fetchPlant(@Param("id") Integer id);
}
