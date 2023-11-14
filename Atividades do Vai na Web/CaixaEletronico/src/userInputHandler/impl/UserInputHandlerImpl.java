package userInputHandler.impl;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.function.Supplier;

import exception.IllegalInputException;
import userInputHandler.UserInputHandler;

public class UserInputHandlerImpl implements UserInputHandler {

  private final String NON_NUMERIC_MESSAGE = "O valor informado não é numérico.";

  @Override
  public int getOption() {
    return handleException(() -> ScannerSingleton.getInstance().nextInt());
  }

  @Override
  public BigDecimal getAmount() {
    return handleException(() -> ScannerSingleton.getInstance().nextBigDecimal());
  }

  private <T> T handleException(Supplier<T> func) {
    try {
      return func.get();
    } catch (InputMismatchException e) {
      ScannerSingleton.getInstance().nextLine();
      throw new IllegalInputException(NON_NUMERIC_MESSAGE);
    } catch (RuntimeException e) {
      throw new IllegalInputException(e.getMessage());
    }
  }

  @Override
  public void close() {
    ScannerSingleton.closeInstance();
  }
}
