package com.lucifaer.joker.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Lucifaer
 * @version 1.0.0.RELEASE
 * @since 2020/11/12
 */
@SpringBootApplication
public class Joker {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Joker.class);
        application.run(args);
    }
}
