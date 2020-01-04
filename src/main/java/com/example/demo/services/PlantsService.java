package com.example.demo.services;

import com.example.demo.entities.Plants;
import com.example.demo.repository.PlantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlantsService {

    private PlantsRepository plantsRepository;

    @Autowired
    public PlantsService (PlantsRepository plantsRepository) {
        this.plantsRepository = plantsRepository;
    }

    public Plants getPlantByName(String plantName) {
        return plantsRepository.fetchPlantByName(plantName);
    }

    public void insertPlant(Plants plant) {
        plantsRepository.save(plant);
    }

    public Long getPlantId(String plantName) {
        return plantsRepository.fetchPlantId(plantName);
    }

    public void removePlantByName(String plantName) {
        Plants p = plantsRepository.fetchPlantByName(plantName);
        plantsRepository.deleteById(p.getPlant_id());
    }

    public Iterable<Plants> selectAllPlants() {
        return plantsRepository.findAll();
    }

    public void modifyPlantByName(String searchedPlant, String newScientificName) {
        plantsRepository.modifyPlant(searchedPlant, newScientificName);
    }

}
