package com.cursoprogramacionreactiva.personalfinance.services;

import org.springframework.stereotype.Service;

import com.cursoprogramacionreactiva.personalfinance.models.Account;
import com.cursoprogramacionreactiva.personalfinance.repositories.AccountRepository;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class AccountService {
  private final AccountRepository repository;

  public Flux<Account> getAccounts() {
    return repository.findAll()
        .onErrorResume(throwable -> {
          System.out.println(throwable.getMessage());
          return Flux.empty();
        });
  }

  public Mono<Account> getAccountById(int id) {
    return repository.findById(id)
        .onErrorResume(throwable -> {
          System.out.println(throwable.getMessage());
          return Mono.empty();
        });
  }
}
