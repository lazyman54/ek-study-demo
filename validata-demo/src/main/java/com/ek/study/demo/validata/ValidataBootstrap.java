package com.ek.study.demo.validata;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ValidataBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ValidataBootstrap.class).web(WebApplicationType.SERVLET).run(args);
    }


}
