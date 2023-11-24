package sort.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import sort.Selection;

public class SelectionImpl<T extends Comparable<T>> implements Selection<T>{

  @Override
  public List<T> sort(List<T> list) {
    int indexMin = 0;
    
    List<T> returnList = new ArrayList<>(list);

    for (int i = 0; i < returnList.size()-1; i++) {
      indexMin = i;
      for (int j = (i+1); j < returnList.size(); j++) {
        if (returnList.get(j).compareTo(returnList.get(indexMin)) < 0) {
          indexMin = j;
        }
      }
      if(indexMin != i){
        Collections.swap(returnList, i, indexMin);
      }
    }

    return returnList;
  }
}
