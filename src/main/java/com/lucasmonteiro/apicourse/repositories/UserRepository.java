package com.lucasmonteiro.apicourse.repositories;

import com.lucasmonteiro.apicourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
