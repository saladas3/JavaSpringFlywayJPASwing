package com.example.demo.services;

import com.example.demo.entities.Plants;
import com.example.demo.repository.PlantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlantsService {

    private PlantsRepository plantsRepository;

    @Autowired
    public PlantsService (PlantsRepository plantsRepository) {
        this.plantsRepository = plantsRepository;
    }

    public List<Plants> findAllPlants() {
        Iterable<Plants> it = plantsRepository.findAll();

        ArrayList<Plants> plants = new ArrayList<>();

        it.forEach(plants::add);

        return plants;
    }

    public String plantsToString() {
        StringBuilder to_return = new StringBuilder();
        ArrayList<Plants> plants = new ArrayList<>(findAllPlants());

        for (Plants p: plants) {
            to_return.append(p.toString());
        }

        return to_return.toString();
    }

    public String getPlant(Integer plantId) {
        return plantsRepository.fetchPlant(plantId);
    }

}
