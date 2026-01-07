package com.handson.spring.mini_project.controller;

import com.handson.spring.mini_project.dto.User;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/basic/v1")
public class BasicController {

    @GetMapping(path = "/sample", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getSample() {
        return ResponseEntity
                .ok()
                .body(Map.of("message", "Excellent Giri !!! Its's working"));
    }

    @PostMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getUser(@RequestBody User user) {
        System.out.println("User data is name : " + user.name() + " and age : " + user.age());
        System.out.println("User record has static variable : " + User.RECORD_USER);
        return ResponseEntity
                .ok()
                .body(new User(user.name(), user.age()));
    }
}
