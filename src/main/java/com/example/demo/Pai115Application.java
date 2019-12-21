package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.WebApplicationType;

@SpringBootApplication
public class Pai115Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Pai115Application.class)
                .headless(false)
                .web(WebApplicationType.NONE)
                .run(args);
    }

}
