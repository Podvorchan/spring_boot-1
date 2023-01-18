package com.example.spring_boot1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Podvorchan Ruslan 03.01.2023
 */
@Data
@AllArgsConstructor
public class Product {

  private int id;
  private String name;
  private Double price;

}
