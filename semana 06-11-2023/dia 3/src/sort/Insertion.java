package sort;

import sort.impl.InsertionImpl;

public interface Insertion<T extends Comparable<T>> extends Sort<T>{

  public static <T extends Comparable<T>> Insertion<T> builder(){
    return new InsertionImpl<T>();
  }
}
