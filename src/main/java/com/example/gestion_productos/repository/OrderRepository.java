package com.example.gestion_productos.repository;

import com.example.gestion_productos.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
