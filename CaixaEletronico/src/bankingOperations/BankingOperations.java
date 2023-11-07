package bankingOperations;

import java.math.BigDecimal;

import bankingOperations.impl.BankingOperationsImpl;
import exception.IllegalBalanceException;

public interface BankingOperations {

  void deposit(BigDecimal deposito) throws IllegalBalanceException;
  void draft(BigDecimal saque) throws IllegalBalanceException;
  BigDecimal getBalance();

  public static BankingOperations builder() {
    return new BankingOperationsImpl(0.0);
  }
}