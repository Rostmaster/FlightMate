package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        // browse to:
        // http://localhost:8090/h2-console
        // username: sa
        // pwd:
        // JDBC URL: jdbc:h2:mem:bookstore

        Object dataSource = context.getBean("dataSource");

        System.out.println("======================");
        System.out.println(dataSource);
        System.out.println("======================");

    }

}