package com.lucasmonteiro.apicourse.services;

import com.lucasmonteiro.apicourse.entities.User;
import com.lucasmonteiro.apicourse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        return repository.findById(id).get();
    }

    public User insert(User user) {
        return repository.save(user);
    }
}
