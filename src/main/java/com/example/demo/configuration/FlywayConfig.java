package com.example.demo.configuration;

import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlywayConfig {
    @Bean("flyway")
    Flyway databaseConfig() {
        Flyway flyway = new Flyway();
        flyway.setDataSource("jdbc:mysql://localhost:3306/ionlucapai115", "root", "root");
        flyway.setLocations("filesystem:src/main/resources/migrations");
        flyway.migrate();
        return flyway;
    }
}
