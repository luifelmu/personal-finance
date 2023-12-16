package com.cursoprogramacionreactiva.personalfinance.models;

import lombok.Data;

@Data
public class Expense {
  private int id;
  private String name;
  private Float amount;
  private String date;
  private Account account;
  private Category category;
}
