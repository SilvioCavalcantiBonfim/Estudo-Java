package sort.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import sort.Bubble;

public class BubbleImpl<T extends Comparable<T>> implements Bubble<T> {

  @Override
  public List<T> sort(List<T> list) {
    List<T> returnList = new ArrayList<T>(list);
    for (int i = 0; i < returnList.size() - 1; i++) {
      for (int j = i + 1; j < returnList.size(); j++) {
        int compare = returnList.get(i).compareTo(returnList.get(j));
        if (compare > 0) {
          Collections.swap(returnList, i, j);
        }
      }
    }
    return returnList;
  }
}
