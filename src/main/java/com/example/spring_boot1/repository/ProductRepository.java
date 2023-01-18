package com.example.spring_boot1.repository;

import com.example.spring_boot1.model.Product;
import java.util.List;
import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @author Podvorchan Ruslan 03.01.2023
 */
@Service
@Data
public class ProductRepository {

  List<Product> products;

  public ProductRepository(List<Product> products) {
    this.products = products;
  }

  public List<Product> getAll() {
    return products;
  }

  public Product getById(int id) {
    return products.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
  }

}
