package com.cursoprogramacionreactiva.personalfinance.config;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;

public class HealthIndicator extends AbstractHealthIndicator {
  @Override
  protected void doHealthCheck(Health.Builder builder) throws Exception {
    builder.up().withDetail("success", "true");
  }
}
