package com.example.demo.services;

import com.example.demo.entities.Plants_Characteristics;
import com.example.demo.repository.Plants_CharacteristicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Plants_CharacteristicsService {
    private Plants_CharacteristicsRepository plants_characteristicsRepository;

    @Autowired
    Plants_CharacteristicsService (Plants_CharacteristicsRepository plants_characteristicsRepository) {
        this.plants_characteristicsRepository = plants_characteristicsRepository;
    }

    public void insertPlantsCharacteristics(Plants_Characteristics plants_characteristics) {
        plants_characteristicsRepository.save(plants_characteristics);
    }

}
