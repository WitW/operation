package com.springbootweb.operation.responsitory;

import com.springbootweb.operation.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductResponsitory extends JpaRepository<Product, Integer> {

}
