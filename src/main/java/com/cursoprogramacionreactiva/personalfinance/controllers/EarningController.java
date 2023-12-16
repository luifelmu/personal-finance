package com.cursoprogramacionreactiva.personalfinance.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoprogramacionreactiva.personalfinance.models.Earning;
import com.cursoprogramacionreactiva.personalfinance.services.EarningService;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("earnings")
@AllArgsConstructor
public class EarningController {
  private final EarningService service;

  @GetMapping
  public Flux<Earning> getEarnings() {
    return service.getEarnings();
  }

  @GetMapping("{id}")
  public Mono<Earning> getEarningById(@PathVariable("id") int id) {
    return service.getEarningById(id);
  }

  @PostMapping
  public Mono<Earning> saveEarning(@RequestBody Earning earning) {
    return service.saveEarning(earning);
  }

  @DeleteMapping("{id}")
  public Mono<Void> deleteEarningById(@PathVariable("id") int id) {
    return service.deleteEarningById(id);
  }
}
