package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class Characteristics {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer characteristic_id;
    private String special_characteristics;
    private String color;
    private Integer height;
    private String season;

    public Characteristics() {};

    public Characteristics(Integer characteristic_id, String special_characteristic, String season,
                           String color, Integer height) {
        this.characteristic_id = characteristic_id;
        this.special_characteristics = special_characteristic;
        this.season = season;
        this.height = height;
        this.color = color;
    }

    public Integer getCharacteristic_id() {
        return characteristic_id;
    }

    public String getSpecial_characteristics() {
        return special_characteristics;
    }

    public String getColor() {
        return color;
    }

    public String getSeason(){return season;}

    public Integer getHeight(){return height;}

    public void setCharacteristic_id(Integer characteristic_id) {
        this.characteristic_id = characteristic_id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setSpecial_characteristics(String special_characteristic) {
        this.special_characteristics = special_characteristic;
    }

    @Override
    public String toString() {
        return "Characteristics{" +
                "characteristic_id=" + characteristic_id +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", season='" + season + '\'' +
                ", special_characteristic='" + special_characteristics + '\'' +
                '}';
    }
}
