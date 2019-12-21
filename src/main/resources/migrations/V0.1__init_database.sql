create table plants(
   plant_id INT NOT NULL AUTO_INCREMENT,
   plant_name VARCHAR(150) NOT NULL,
   scientific_name VARCHAR(300) NOT NULL,
   PRIMARY KEY ( plant_id )
);

create table characteristics(
    characteristic_id INT NOT NULL AUTO_INCREMENT,
    special_characteristics VARCHAR(500) NOT NULL,
    color VARCHAR(40) NOT NULL,
    height FLOAT NOT NULL,
    season VARCHAR(40) NOT NULL,
    PRIMARY KEY ( characteristic_id )
);

create table plants_characteristics(
    plants_characteristics_id INT NOT NULL AUTO_INCREMENT,
    plant_id INT NULL,
    characteristic_id INT NULL,
    PRIMARY KEY ( plants_characteristics_id )
);
