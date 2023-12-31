package model;

import model.impl.RandomNumberGenerateImpl;

public interface RandomNumberGenerate {

  int nextInt(int bound);

  static RandomNumberGenerate builder() {
    return new RandomNumberGenerateImpl();
  }

}