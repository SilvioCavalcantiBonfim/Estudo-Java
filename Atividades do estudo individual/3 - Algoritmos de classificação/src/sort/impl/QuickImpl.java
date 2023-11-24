package sort.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import sort.Quick;

public class QuickImpl<T extends Comparable<T>> implements Quick<T> {

  @Override
  public List<T> sort(List<T> list) {
    List<T> copyList = new ArrayList<T>(list);
    quickSort(copyList, 0, list.size()-1);
    return copyList;
  }

  private void quickSort(List<T> list, int begin, int end){
    int i,j;
    i = begin;
    j = end;
    T currentPivot = list.get((begin+end)/2);
    while (i <= j) {
      while (list.get(i).compareTo(currentPivot) < 0 && i < end) {
        i++;
      }
      while (list.get(j).compareTo(currentPivot) > 0 && j > begin) {
        j--;
      }
      if (i <= j) {
        Collections.swap(list, i, j);
        i++;
        j--;
      }
    }
    if (j > begin) {
      quickSort(list, begin, j);
    }
    if (i < end) {
      quickSort(list, i, end);
    }
  }
  
}
