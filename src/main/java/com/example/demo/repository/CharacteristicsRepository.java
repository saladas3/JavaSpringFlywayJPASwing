package com.example.demo.repository;

import com.example.demo.entities.Characteristics;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacteristicsRepository extends CrudRepository<Characteristics, Long> {

}
