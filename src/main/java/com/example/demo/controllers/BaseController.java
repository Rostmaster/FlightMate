package com.example.demo.controllers;

import com.example.demo.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;

public abstract class BaseController<T> {

    @Autowired
    BaseService<T> service;

    @GetMapping
    public Iterable<T> getAll() {
        return service.getAll();
    }
}