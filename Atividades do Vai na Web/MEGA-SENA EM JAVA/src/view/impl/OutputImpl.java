package view.impl;

import view.Output;

public class OutputImpl implements Output {

  @Override
  public void println(Object msg) {
    System.out.println(msg);
  }

  @Override
  public void print(Object msg) {
    System.out.print(msg);
  }
}
