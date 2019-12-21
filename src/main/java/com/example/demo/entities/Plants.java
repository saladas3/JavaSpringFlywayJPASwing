package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plants {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer plant_id;
    private String plant_name;
    private String scientific_name;

    public Plants() {};

    public Plants(Integer plant_id, String plant_name, String scientific_name) {
        this.plant_id = plant_id;
        this.plant_name = plant_name;
        this.scientific_name = scientific_name;
    }

    public Integer getPlant_id() {
        return plant_id;
    }

    public String getPlant_name() {
        return plant_name;
    }

    public String getScientific_name() {
        return scientific_name;
    }

    public void setPlant_id(Integer plant_id) {
        this.plant_id = plant_id;
    }

    public void setPlant_name(String plant_name) {
        this.plant_name = plant_name;
    }

    public void setScientific_name(String scientific_name) {
        this.scientific_name = scientific_name;
    }

    @Override
    public String toString() {
        return "Plants{" +
                "plant_id=" + plant_id +
                ", plant_name='" + plant_name + '\'' +
                ", scientific_name='" + scientific_name + '\'' +
                '}';
    }
}
