ALTER TABLE ionlucapai115.plants_characteristics
    ADD INDEX fk_plants_characteristics_1_idx (plant_id ASC),
    ADD INDEX fk_plants_characteristics_2_idx (characteristic_id ASC);

ALTER TABLE ionlucapai115.plants_characteristics
    ADD CONSTRAINT fk_plants_characteristics_1
        FOREIGN KEY (plant_id)
            REFERENCES ionlucapai115.plants (plant_id)
            ON DELETE CASCADE
            ON UPDATE CASCADE,
    ADD CONSTRAINT fk_plants_characteristics_2
        FOREIGN KEY (characteristic_id)
            REFERENCES ionlucapai115.characteristics (characteristic_id)
            ON DELETE CASCADE
            ON UPDATE CASCADE;
