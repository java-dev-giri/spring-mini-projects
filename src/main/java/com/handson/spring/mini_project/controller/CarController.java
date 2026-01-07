package com.handson.spring.mini_project.controller;

import com.handson.spring.mini_project.sampleClasses.Car;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("car/v1")
public class CarController {

    private Car car;

    public CarController(@Qualifier("suzuki") Car car) {
        this.car = car;
    }

    @GetMapping("/car")
    public ResponseEntity<String> getCarDetails() {
        return ResponseEntity.ok().body(
                """
                {
                    "car_name" : %s,
                    "car_model" : %s,
                    "car_type" : %s
                }
                """.formatted(car.getName(), car.getModel(), car.getType())
        );
    }

}
