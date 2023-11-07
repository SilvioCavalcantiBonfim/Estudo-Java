package userInputHandler;

import java.math.BigDecimal;

import userInputHandler.impl.UserInputHandlerImpl;

public interface UserInputHandler  {
  int getOption();
  BigDecimal getAmount();
  void close();

  public static UserInputHandler builder(){
    return new UserInputHandlerImpl();
  }
}
