package sort;

import sort.impl.SelectionImpl;

public interface Selection<T extends Comparable<T>> extends Sort<T> {

  public static <T extends Comparable<T>> Selection<T> builder(){
    return new SelectionImpl<T>();
  }
  
}
