package com.ecosio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * Sample JPA application
 */
@SpringBootApplication
public class Application {
  
  private static final Logger LOG = LoggerFactory.getLogger(Application.class.getName());




  public static void main(String[] args) {
    ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

  }





}
