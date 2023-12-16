package com.cursoprogramacionreactiva.personalfinance.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("accounts")
public class Account {
  @Id
  private int id;
  private String name;
  private Float initialBalance;
}
