package com.lucasmonteiro.apicourse.repositories;

import com.lucasmonteiro.apicourse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
