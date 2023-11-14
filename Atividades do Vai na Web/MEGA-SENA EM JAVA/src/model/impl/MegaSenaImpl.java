package model.impl;

import exception.*;
import model.MegaSena;

public class MegaSenaImpl implements MegaSena {

  private final int[] chose;
  private final int[] chosen;
  private final int minValue;
  private final int maxValue;
  private int totalInsertionsInChoose = 0;
  private int totalInsertionsInChosen = 0;

  public MegaSenaImpl(int min, int max, int total){
    minValue = min;
    maxValue = max;
    chose = new int[total];
    chosen = new int[total];
    for (int i = 0; i < total; i++) {
      chose[i] = -1;
      chosen[i] = -1;
    }
  }

  @Override
  public void addInSelected(int value){
    if(inSelected(value)){
      throw new IllegalNumberException();
    }
    if (value < minValue || value > maxValue) {
      throw new OffBoundException();
    }
    chose[totalInsertionsInChoose] = value;
    totalInsertionsInChoose++;
  }

  private boolean inSelected(int value){
    for (int i = 0; i < totalInsertionsInChoose; i++) {
      if (chose[i] == value) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void addInChosen(int value){
    chosen[totalInsertionsInChosen] = value;
    totalInsertionsInChosen++;
  }

  @Override
  public int result() throws CompleteFillChosenException, CompleteFillChooseException{
    
    if(totalInsertionsInChosen != chosen.length){
      throw new CompleteFillChosenException();
    }
    
    if (!isCompleteFill()) {
      throw new CompleteFillChooseException();
    }

    int result = 0;
    for (int i : chosen) {
      for (int j : chose) {
        if (i==j) {
          result++;
        }
      }
    }
    return result;
  }

  @Override
  public boolean isCompleteFill(){
    return totalInsertionsInChoose == chose.length;
  }

  @Override
  public int[] getChose() {
    return chose;
  }

  @Override
  public int[] getChosen() {
    return chosen;
  }
  
}
