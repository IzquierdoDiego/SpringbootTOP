package com.diego.constructorinjection2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication(scanBasePackages = {"com.diego.constructorinjection2",
                                            "com.luv2code.util"})
*/

@SpringBootApplication
public class ConstructorInjection2Application {

    public static void main(String[] args) {
        SpringApplication.run(ConstructorInjection2Application.class, args);
    }

}
