package com.ashish.productcatalog.core.repository;

import com.ashish.productcatalog.core.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Ashish Kapoor
 */

public interface ProductRepository extends JpaRepository<Product, Long>, ProductRepositoryCustom {
    List<Product> findByColor(String color);
    List<Product> findByBrand(String brand);
    List<Product> findBySize(String brand);
}
