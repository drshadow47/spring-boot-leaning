package com.shadow.test.Test.Project.repository;

import com.shadow.test.Test.Project.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo  extends JpaRepository<Product,Integer> {

    Product findByName(String name);
}
