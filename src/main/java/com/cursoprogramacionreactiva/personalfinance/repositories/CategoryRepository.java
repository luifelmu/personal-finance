package com.cursoprogramacionreactiva.personalfinance.repositories;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import com.cursoprogramacionreactiva.personalfinance.models.Category;

@Repository
public interface CategoryRepository extends R2dbcRepository<Category, Integer> {
}
