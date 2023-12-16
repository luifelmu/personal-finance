package com.cursoprogramacionreactiva.personalfinance.services;

import org.springframework.stereotype.Service;

import com.cursoprogramacionreactiva.personalfinance.models.Category;
import com.cursoprogramacionreactiva.personalfinance.repositories.CategoryRepository;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class CategoryService {
  private final CategoryRepository repository;

  public Flux<Category> getCategories() {
    return repository.findAll()
        .onErrorResume(throwable -> {
          System.out.println(throwable.getMessage());
          return Flux.empty();
        });
  }

  public Mono<Category> getCategoryById(int id) {
    return repository.findById(id)
        .onErrorResume(throwable -> {
          System.out.println(throwable.getMessage());
          return Mono.empty();
        });
  }
}
