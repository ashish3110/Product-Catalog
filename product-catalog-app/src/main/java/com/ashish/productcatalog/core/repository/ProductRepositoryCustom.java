package com.ashish.productcatalog.core.repository;

import com.ashish.productcatalog.core.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

/**
 * @author Ashish Kapoor
 */

public interface ProductRepositoryCustom {
    
    @Query("select p from Product p where p.price >= :min and p.price <= :max")
    List<Product> findByPriceRange(@Param("min") Double min, @Param("max")  Double max);
    
    @Query("select p from Product p where p.color IN :#{#colors}")
    List<Product> findByColors(@Param("colors") Collection<String> colors);
    
    @Query("select p from Product p where p.size IN :#{#sizes}")
    List<Product> findBySizes (@Param("sizes") Collection<String> sizes);
    
    @Query("select p from Product p where p.brand IN :#{#brands}")
    List<Product> findByBrands (@Param("brands") Collection<String> brands);
    
    @Query("select p from Product p where p.type = :type")
    List<Product> findByType (@Param("type") String type);
    
    @Query("select p from Product p where p.type = :type and p.brand IN :#{#brands}")
    List<Product> findByTypeAndBrands (@Param("type") String type, @Param("brands") Collection<String> brands);
    
    @Query("select p from Product p where p.type = :type and p.color IN :#{#colors}")
    List<Product> findByTypeAndColors (@Param("type") String type, @Param("colors") Collection<String> colors);
    
    @Query("select p from Product p where p.type = :type and p.color IN :#{#colors} and p.brand IN :#{#brands}")
    List<Product> findByTypeBrandsColors (@Param("type") String type, @Param("colors") Collection<String> colors, @Param("brands") Collection<String> brands);

}
