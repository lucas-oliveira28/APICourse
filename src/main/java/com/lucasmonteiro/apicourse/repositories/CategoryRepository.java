package com.lucasmonteiro.apicourse.repositories;

import com.lucasmonteiro.apicourse.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
