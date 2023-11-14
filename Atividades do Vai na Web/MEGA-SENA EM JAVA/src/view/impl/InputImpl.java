package view.impl;

import java.util.InputMismatchException;
import java.util.Scanner;

import view.Input;

public class InputImpl implements Input {
  
  public final Scanner sc;

  public InputImpl(){
    sc = new Scanner(System.in);
  }

  @Override
  public int nextInt() throws InputMismatchException{
    return sc.nextInt();
  }

  @Override
  public void close(){
    sc.close();
  }

  @Override
  public void clearBuffer() {
    sc.nextLine();
  }

}
