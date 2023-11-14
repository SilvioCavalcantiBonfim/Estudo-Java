package view;

import java.util.InputMismatchException;

import view.impl.InputImpl;

public interface Input {

  int nextInt() throws InputMismatchException;

  void clearBuffer();

  void close();

  static Input builder(){
    return new InputImpl();
  }
}