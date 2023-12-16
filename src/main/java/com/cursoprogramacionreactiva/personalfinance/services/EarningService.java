package com.cursoprogramacionreactiva.personalfinance.services;

import org.springframework.stereotype.Service;

import com.cursoprogramacionreactiva.personalfinance.models.Earning;
import com.cursoprogramacionreactiva.personalfinance.repositories.EarningRepository;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class EarningService {
  private final EarningRepository repository;

  public Flux<Earning> getEarnings() {
    return repository.findAll()
        .onErrorResume(throwable -> {
          System.out.println(throwable.getMessage());
          return Flux.empty();
        });
  }

  public Mono<Earning> getEarningById(int id) {
    return repository.findById(id)
        .onErrorResume(throwable -> {
          System.out.println(throwable.getMessage());
          return Mono.empty();
        });
  }

  public Mono<Earning> saveEarning(Earning earning) {
    return repository.save(earning)
        .onErrorResume(throwable -> {
          System.out.println(throwable.getMessage());
          return Mono.empty();
        });
  }

  public Mono<Void> deleteEarningById(int id) {
    return repository.deleteById(id)
        .onErrorResume(throwable -> {
          System.out.println(throwable.getMessage());
          return Mono.empty();
        });
  }
}
