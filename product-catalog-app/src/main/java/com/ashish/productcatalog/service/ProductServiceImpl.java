package com.ashish.productcatalog.service;

import com.ashish.productcatalog.core.entity.Product;
import com.ashish.productcatalog.core.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * @author Ashish Kapoor
 */

@Service
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    
    @Override
    public List<Product> productsByColor(String color) {
        return productRepository.findByColor(color);
    }
    
    @Override
    public List<Product> productsByBrand(String brand) {
        return productRepository.findByBrand(brand);
    }
    
    @Override
    public List<Product> productsBySize(String size) {
        return productRepository.findBySize(size);
    }
    
    @Override
    public List<Product> productsByPriceRange(Double min, Double max) {
        return productRepository.findByPriceRange(min, max);
    }
    
    @Override
    public List<Product> productsByColors(Collection<String> colors) {
        return productRepository.findByColors(colors);
    }
    
    @Override
    public List<Product> productsBySizes(Collection<String> sizes) {
        return productRepository.findBySizes(sizes);
    }
    
    @Override
    public List<Product> productsByBrands(Collection<String> brands) {
        return productRepository.findByBrands(brands);
    }
    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
    
    @Override
    public List<Product> findAllProductsByParams(String productType, Collection<String> brands, Collection<String> colors) {
        if (brands != null && colors != null && !brands.isEmpty() && !colors.isEmpty()) {
            return productRepository.findByTypeBrandsColors(productType, colors, brands);
        } else if (brands != null && !brands.isEmpty()) {
            return productRepository.findByTypeAndBrands(productType, brands);
        } else if (colors != null && !colors.isEmpty()) {
            return productRepository.findByTypeAndColors(productType, colors);
        } else {
            return productRepository.findByType(productType);
        }
    }
}
