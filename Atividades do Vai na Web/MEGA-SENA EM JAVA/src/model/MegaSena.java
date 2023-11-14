package model;

import model.impl.MegaSenaImpl;

public interface MegaSena {

  void addInSelected(int value);

  void addInChosen(int value);

  int result();

  int[] getChose();

  int[] getChosen();

  boolean isCompleteFill();

  static MegaSena builder(int min, int max, int total){
    return new MegaSenaImpl(min, max, total);
  }

}