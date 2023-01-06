package com.example.spring_boot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringBoot1Application {

  public static void main(String[] args) {
    SpringApplication.run(SpringBoot1Application.class, args);
  }

  @Autowired
  Servis serviceCart;


  @EventListener(ApplicationReadyEvent.class)
  public void start() {
    serviceCart.serviceCart();
  }
}

