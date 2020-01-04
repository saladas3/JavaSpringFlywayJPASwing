package com.example.demo.services;

import com.example.demo.entities.Characteristics;
import com.example.demo.repository.CharacteristicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacteristicsService {
    private CharacteristicsRepository characteristicsRepository;

    @Autowired
    public CharacteristicsService (CharacteristicsRepository characteristicsRepository) {
        this.characteristicsRepository = characteristicsRepository;
    }

    public void insertCharacteristic(Characteristics characteristic) {
        characteristicsRepository.save(characteristic);
    }

    public Long getCharacteristicId(String special_characteristic) {
        return characteristicsRepository.fetchCharacteristicId(special_characteristic);
    }

    public Iterable<Characteristics> selectAllCharacteristics() {
        return characteristicsRepository.findAll();
    }

    public Characteristics getCharacteristicByName(String characteristicName) {
        return characteristicsRepository.fetchCharacteristicByName(characteristicName);
    }

    public void removeCharacteristicFromTable(String characteristicName) {
        Characteristics c = characteristicsRepository.fetchCharacteristicByName(characteristicName);
        characteristicsRepository.deleteById(c.getCharacteristic_id());
    }

    public void modifyCharacteristicByName(String searchedCharacteristic, String newColor, Float newHeight, String newSeason) {
        characteristicsRepository.modifyCharacteristicByName(searchedCharacteristic, newColor, newHeight, newSeason);
    }
}
