package com.handson.spring.mini_project.sampleClasses;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Suzuki implements Car{

    @PostConstruct
    public void afterInit() {
        System.out.println("Suzuki launched the car !!");
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println("Suzuki's cars are sold!! Try next time");
    }

    @Override
    public String getName() {
        return "Suzuki Victoris";
    }

    @Override
    public String getModel() {
        return "Top model";
    }

    @Override
    public String getType() {
        return "SUV";
    }
}
