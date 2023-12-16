package com.cursoprogramacionreactiva.personalfinance.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("categories")
public class Category {
  @Id
  private int id;
  private String name;
  private String type;
}
