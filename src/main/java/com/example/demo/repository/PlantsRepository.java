package com.example.demo.repository;

import com.example.demo.entities.Plants;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
public interface PlantsRepository extends CrudRepository<Plants, Long> {
    @Transactional
    @Modifying
    @Query("UPDATE Plants p SET p.scientific_name = :newScientificName WHERE p.plant_name = :searchedPlant")
    void modifyPlant(@Param("searchedPlant") String searchedPlant,
                     @Param("newScientificName") String newScientificName);

    @Query("SELECT p.plant_id FROM Plants p WHERE p.plant_name = :p_name")
    Long fetchPlantId(@Param("p_name") String p_name);

    @Query("SELECT plant FROM Plants plant WHERE plant.plant_name = :plantName")
    Plants fetchPlantByName(@Param("plantName") String plantName);

    //@Query("SELECT p.plant_name FROM Plants p JOIN Plants_Characteristics pc ON p.plant_id = pc.plant_id WHERE pc.characteristic_id = :id")
    //String fetchPlant(@Param("id") Integer id);
}
