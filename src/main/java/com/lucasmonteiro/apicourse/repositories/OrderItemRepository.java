package com.lucasmonteiro.apicourse.repositories;

import com.lucasmonteiro.apicourse.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
