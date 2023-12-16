package com.cursoprogramacionreactiva.personalfinance.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("earnings")
public class Earning {
  @Id
  private int id;
  private String name;
  private Float amount;
  private String date;
  @Column("account_id")
  private int account;
  @Column("category_id")
  private int category;
}
