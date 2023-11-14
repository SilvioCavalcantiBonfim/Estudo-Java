package model.impl;

import model.Chosen;
import model.RandomNumberGenerate;

public final class ChosenImpl implements Chosen {
  
  private int[] allNumberForChosen;
  private final int minNumberForChosen;
  private final int maxNumberForChosen;
  private final RandomNumberGenerate rng;

  public ChosenImpl(int minNumberForChosen, int maxNumberForChosen) {
    this.minNumberForChosen = minNumberForChosen;
    this.maxNumberForChosen = maxNumberForChosen;
    this.allNumberForChosen = new int[maxNumberForChosen-minNumberForChosen];
    this.rng = RandomNumberGenerate.builder();
  }

  @Override
  public int[] nextChosen(int total){
    int[] chosenNumber = new int[total];
    initAllNumber();
    for (int i = 0; i < total; i++) {
      int chosenIndex = rng.nextInt(allNumberForChosen.length);
      chosenNumber[i] = allNumberForChosen[chosenIndex];
      allNumberForChosen = remove(chosenIndex);
    }
    return chosenNumber;
  }

  private void initAllNumber(){
    for (int i = minNumberForChosen; i < maxNumberForChosen; i++) {
      allNumberForChosen[i] = i;
    }
  }

  private int[] remove(int index){
    int[] newArray = new int[allNumberForChosen.length-1];
    for (int i = 0; i < index; i++) {
      newArray[i] = allNumberForChosen[i];
    }
    for (int i = index+1; i < allNumberForChosen.length; i++) {
      newArray[i-1] = allNumberForChosen[i];
    }
    return newArray;
  }
}
