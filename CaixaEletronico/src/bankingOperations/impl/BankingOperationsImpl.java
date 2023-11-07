package bankingOperations.impl;

import java.math.BigDecimal;

import bankingOperations.BankingOperations;
import exception.IllegalBalanceException;

public class BankingOperationsImpl implements BankingOperations {

  private BigDecimal balance;

  public BankingOperationsImpl(Double initialBalance) {
    balance = BigDecimal.valueOf(initialBalance);
  }

  @Override
  public void deposit(BigDecimal depositAmount) {
    if (depositAmount.compareTo(BigDecimal.ZERO) >= 0) {
      balance = balance.add(depositAmount);
    } else {
      throw new IllegalBalanceException(String.format("Não é possivel depositar R$ %.2f na conta.", depositAmount));
    }
  }

  @Override
  public void draft(BigDecimal draftValue) {
    BigDecimal newBalance = balance.subtract(draftValue);
    if (newBalance.compareTo(BigDecimal.ZERO) >= 0) {
      balance =newBalance;
    } else {
      throw new IllegalBalanceException(
          String.format("Não é possivel sacar R$ %.2f da conta. Saldo insuficiente.", draftValue));
    }
  }

  public BigDecimal getBalance(){
    return balance;
  }
}
