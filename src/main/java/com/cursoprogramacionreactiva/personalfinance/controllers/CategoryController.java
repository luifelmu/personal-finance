package com.cursoprogramacionreactiva.personalfinance.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoprogramacionreactiva.personalfinance.models.Category;
import com.cursoprogramacionreactiva.personalfinance.services.CategoryService;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("categories")
@AllArgsConstructor
public class CategoryController {

  private final CategoryService service;
  
  @GetMapping
  public Flux<Category> getCategories() {
    return service.getCategories();
  }

  @GetMapping("{id}")
  public Mono<Category> getCategoryById(@PathVariable("id") int id) {
    return service.getCategoryById(id);
  }
}
