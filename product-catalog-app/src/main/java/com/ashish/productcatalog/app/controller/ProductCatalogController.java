package com.ashish.productcatalog.app.controller;

import com.ashish.productcatalog.core.entity.Product;
import com.ashish.productcatalog.service.ProductService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

/**
 * @author Ashish Kapoor
 */

@RestController
@RequestMapping("/products")
public class ProductCatalogController {
    
    @Autowired
    private ProductService productService;
    
    @ApiOperation("API to fetch Products based on price range(Min,Max)")
    @GetMapping("/price")
    public List<Product> getProductByPriceRange(@RequestParam("min") double min, @RequestParam("max") double max) {
        return productService.productsByPriceRange(min, max);
    }
    
    @ApiOperation("API to fetch All Products")
    @GetMapping("")
    public List<Product> getAllProducts() {
        return productService.findAllProducts();
    }
    
    @ApiOperation("API to fetch Products based on product type(mandatory) ,Brands(optional) and Colors(optional)")
    @GetMapping("/{productType}")
    public List<Product> getProductByPriceRange(@PathVariable("productType") String productType,
                                                @RequestParam(name = "brands", required = false) Collection<String> brands,
                                                @RequestParam(name = "colors", required = false) Collection<String> colors) {
        return productService.findAllProductsByParams(productType, brands, colors);
    }
    
    @ApiOperation("API to fetch Products based on Colors")
    @GetMapping("/colors")
    public List<Product> getProductByColor(@RequestParam("colors") Collection<String> colors) {
        return productService.productsByColors(colors);
    }
    
    @ApiOperation("API to fetch Products based on Brands")
    @GetMapping("/brands")
    public List<Product> getProductByBrands(@RequestParam("brands") Collection<String> brands) {
        return productService.productsByBrands(brands);
    }
    
    @ApiOperation("API to fetch Products based on Product Sizes(String)")
    @GetMapping("/sizes")
    public List<Product>  getProductBySizes(@RequestParam("sizes") Collection<String> sizes) {
        return productService.productsBySizes(sizes);
    }

}
