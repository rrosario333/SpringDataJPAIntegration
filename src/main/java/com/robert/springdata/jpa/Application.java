package com.robert.springdata.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by robert.
 */
@SpringBootApplication
public class Application {


    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication();
        ApplicationContext ctx = springApplication.run(Application.class, args);
    }
}
