package sort.impl;

import java.util.ArrayList;
import java.util.List;

import sort.Insertion;

public class InsertionImpl<T extends Comparable<T>> implements Insertion<T>{

  @Override
  public List<T> sort(List<T> list) {
    List<T> copyList = new ArrayList<>(list);
    T currentElement;
    int size = copyList.size();
    int j;
    for (int i = 1; i < size; i++) {
      currentElement = copyList.get(i);
      j = i-1;
      while (j >= 0 && copyList.get(j).compareTo(currentElement) > 0) {
        T aux = copyList.get(j);
        copyList.set(j+1, aux);
        j -= 1;
      }
      if(j+1 != i){
        copyList.set(j+1, currentElement);
      }
    }
    return copyList;
  }
  
}
