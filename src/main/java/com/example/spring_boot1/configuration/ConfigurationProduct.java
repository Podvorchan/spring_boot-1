package com.example.spring_boot1.configuration;

import com.example.spring_boot1.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Podvorchan Ruslan 03.01.2023
 */
@Configuration
public class ConfigurationProduct {

  @Bean
  public Product cocaCola() {
    return new Product(1, "Coca Cola", 38.5);
  }

  @Bean
  public Product pepsi() {
    return new Product(2, "Pepsi", 40.0);
  }

  @Bean
  public Product borgomi() {
    return new Product(3, "Borgomi", 69.3);
  }

  @Bean
  public Product redBull() {
    return new Product(4, "Red Bull", 59.0);
  }

}
