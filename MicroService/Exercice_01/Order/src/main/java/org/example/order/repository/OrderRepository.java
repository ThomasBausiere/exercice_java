package org.example.order.repository;

import org.aspectj.weaver.ast.Or;
import org.example.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
