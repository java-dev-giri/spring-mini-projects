package com.handson.spring.mini_project.sampleClasses;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
@Primary
public class Tata implements Car{

    @PostConstruct
    public void afterInit() {
        System.out.println("Tata launched the car !!");
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println("Tata's cars are sold!! Try next time");
    }

    @Override
    public String getName() {
        return "Tata HARRIER.EV";
    }

    @Override
    public String getModel() {
        return "TOP MODEL";
    }

    @Override
    public String getType() {
        return "XUV";
    }
}
