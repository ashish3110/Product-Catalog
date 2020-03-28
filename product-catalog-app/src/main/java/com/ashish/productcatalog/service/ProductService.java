package com.ashish.productcatalog.service;

import com.ashish.productcatalog.core.entity.Product;

import java.util.Collection;
import java.util.List;

/**
 * @author Ashish Kapoor
 */

public interface ProductService  {
    
    List<Product> productsByColor(String color);
    List<Product> productsByBrand(String brand);
    List<Product> productsBySize(String size);
    List<Product> productsByPriceRange(Double min, Double max);
    List<Product> productsByColors(Collection<String> colors);
    List<Product> productsBySizes(Collection<String> sizes);
    List<Product> productsByBrands(Collection<String> brands);
    List<Product> findAllProducts();
    
    List<Product> findAllProductsByParams(String productType, Collection<String> brands, Collection<String> colors);
}
