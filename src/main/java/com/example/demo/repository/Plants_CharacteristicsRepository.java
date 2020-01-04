package com.example.demo.repository;

import com.example.demo.entities.Plants_Characteristics;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Plants_CharacteristicsRepository extends CrudRepository<Plants_Characteristics, Long> {

}
