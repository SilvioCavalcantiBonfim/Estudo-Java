package view;

import view.impl.OutputImpl;

public interface Output {

  void println(Object msg);

  void print(Object msg);

  static Output builder(){
    return new OutputImpl();
  }

}