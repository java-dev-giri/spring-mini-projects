package com.handson.spring.mini_project.dto;

import java.time.LocalDateTime;
/*
    - Record is the type which can be reduced boilerplate code for getters and setters
      with all args constructor and all object methods overridden like
      toString(), hashCode(), equals() methods.
    - This record will be created with all instance variable as private final
 */
public record User(String name, int age, LocalDateTime timeSTamp) {

    //we can define static variable methods
    public static final String RECORD_USER = "Constant from record";

    //We can have multiple overloaded constructor's and methods as well
    public User(String name, int age) {
        this(name, age, LocalDateTime.now());
    }
}
