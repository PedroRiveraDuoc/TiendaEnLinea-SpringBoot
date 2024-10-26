package com.example.gestion_productos.repository;

import com.example.gestion_productos.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
