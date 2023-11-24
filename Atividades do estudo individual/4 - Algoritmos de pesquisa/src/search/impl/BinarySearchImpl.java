package search.impl;

import java.util.List;

import search.BinarySearch;

public class BinarySearchImpl<T extends Comparable<T>> implements BinarySearch<T> {
  
  private int binarySearch(List<T> list, T element, int start, int end){
    if(start > end)
      return -1;
    int m = Math.round((start+end)/2);
    if (element.compareTo(list.get(m)) == 0) {
      return m;
    }else if(list.get(m).compareTo(element) < 0){
      return binarySearch(list, element, m+1, end);
    } else {
      return binarySearch(list, element, start, m-1);
    }
  }

  @Override
  public int search(List<T> list, T element) {
    return binarySearch(list, element, 0, list.size());
  }
}
