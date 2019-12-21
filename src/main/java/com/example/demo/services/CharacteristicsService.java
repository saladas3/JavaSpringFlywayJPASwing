package com.example.demo.services;

import com.example.demo.entities.Characteristics;
import com.example.demo.repository.CharacteristicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CharacteristicsService {
    private CharacteristicsRepository characteristicsRepository;

    @Autowired
    public CharacteristicsService (CharacteristicsRepository characteristicsRepository) {
        this.characteristicsRepository = characteristicsRepository;
    }

    public ArrayList<Characteristics> findAllCharacteristics() {
        Iterable<Characteristics> it = characteristicsRepository.findAll();

        ArrayList<Characteristics> characteristic = new ArrayList<>();

        it.forEach(characteristic::add);

        return characteristic;
    }

    public String characteristicsToString() {
        StringBuilder to_return = new StringBuilder();
        ArrayList<Characteristics> characteristic = new ArrayList<>(findAllCharacteristics());

        for (Characteristics c: characteristic) {
            to_return.append(c.toString());
        }

        return to_return.toString();
    }
}
