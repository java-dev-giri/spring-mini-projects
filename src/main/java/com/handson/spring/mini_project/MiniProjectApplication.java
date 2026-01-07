package com.handson.spring.mini_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MiniProjectApplication {

	public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(MiniProjectApplication.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        System.out.println("Beans total " + beanDefinitionNames.length);
    }

}
