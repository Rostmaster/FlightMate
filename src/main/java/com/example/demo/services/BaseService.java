package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public class BaseService<T> {

    @Autowired
    CrudRepository<T, Integer> repository;

    public Iterable<T> getAll() {
        // Implement logic to create the object and return it
        return repository.findAll();
    }
}
