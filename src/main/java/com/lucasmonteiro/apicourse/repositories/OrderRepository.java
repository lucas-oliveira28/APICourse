package com.lucasmonteiro.apicourse.repositories;

import com.lucasmonteiro.apicourse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
