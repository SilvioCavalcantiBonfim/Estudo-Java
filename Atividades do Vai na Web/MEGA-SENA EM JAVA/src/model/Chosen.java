package model;

import model.impl.ChosenImpl;

public interface Chosen {

  int[] nextChosen(int total);

  static Chosen builder(int min, int max){
    return new ChosenImpl(min, max);
  }
}