package com.example.demo.repository;

import com.example.demo.entities.Characteristics;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CharacteristicsRepository extends CrudRepository<Characteristics, Long> {
    @Query("SELECT c.characteristic_id FROM Characteristics c WHERE c.special_characteristics = :c_name")
    Long fetchCharacteristicId(@Param("c_name") String c_name);

    @Query("SELECT characteristic FROM Characteristics characteristic WHERE characteristic.special_characteristics = :characteristicName")
    Characteristics fetchCharacteristicByName(@Param("characteristicName") String characteristicName);

    @Modifying
    @Transactional
    @Query("UPDATE Characteristics c SET " +
            "c.color = :newColor, c.height = :newHeight, c.season = :newSeason " +
            "WHERE c.special_characteristics = :searchedCharacteristic")
    void modifyCharacteristicByName(@Param("searchedCharacteristic") String searchedCharacteristic,
                                    @Param("newColor") String newColor,
                                    @Param("newHeight") Float newHeight,
                                    @Param("newSeason") String newSeason);
}
