package com.cursoprogramacionreactiva.personalfinance.repositories;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import com.cursoprogramacionreactiva.personalfinance.models.Earning;

public interface EarningRepository extends R2dbcRepository<Earning, Integer> {
}
