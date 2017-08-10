package com.gato.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Andy on 2017/8/4.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println("spring boot run !");
        SpringApplication.run(Application.class, args);

    }
}
