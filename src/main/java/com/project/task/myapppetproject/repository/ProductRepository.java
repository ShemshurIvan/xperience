package com.project.task.myapppetproject.repository;

import com.project.task.myapppetproject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
