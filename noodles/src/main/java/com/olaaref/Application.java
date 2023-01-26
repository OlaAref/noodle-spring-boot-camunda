package com.olaaref;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.olaaref.noodles.workflow")
public class Application {

  public static void main(String... args) {
    SpringApplication.run(Application.class, args);
  }

}