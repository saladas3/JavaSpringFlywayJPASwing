package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class Plants_Characteristics {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer plants_characteristics_id;
    private Integer plant_id;
    private Integer characteristic_id;

}
