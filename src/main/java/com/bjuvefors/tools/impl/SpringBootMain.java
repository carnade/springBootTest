package com.bjuvefors.tools.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages= "com.bjuvefors.tools.impl.systemet")
@SpringBootApplication
public class SpringBootMain {

    public static void main(String [] args)  {
        SpringApplication.run(SpringBootMain.class, args);

    }
}
