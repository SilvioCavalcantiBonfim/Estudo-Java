package search.impl;

import java.util.ArrayList;
import java.util.List;

import search.LinearSearch;

public class LinearSearchImpl implements LinearSearch {

  @Override
  public int search(List<?> list, Object element) {
    List<?> listForSearch = new ArrayList<>(list);
    int indexResult = -1;
    for (int i = 0; i < listForSearch.size(); i++) {
      if(element.equals(listForSearch.get(i))){
        indexResult = i;
        break;
      }
    }
    return indexResult;
  }
  
}
