package com.cursoprogramacionreactiva.personalfinance.repositories;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import com.cursoprogramacionreactiva.personalfinance.models.Account;

@Repository
public interface AccountRepository extends R2dbcRepository<Account, Integer>{
}
