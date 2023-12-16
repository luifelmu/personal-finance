package com.cursoprogramacionreactiva.personalfinance.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoprogramacionreactiva.personalfinance.models.Account;
import com.cursoprogramacionreactiva.personalfinance.services.AccountService;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("accounts")
@AllArgsConstructor
public class AccountController {
  private final AccountService service;

  @GetMapping
  public Flux<Account> getAccounts() {
    return service.getAccounts();
  }

  @GetMapping("{id}")
  public Mono<Account> getAccountById(@PathVariable("id") int id) {
    return service.getAccountById(id);
  }
}
