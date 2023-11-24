package search;

import java.util.List;

import search.impl.BinarySearchImpl;

public interface BinarySearch<T extends Comparable<T>>{

  public int search(List<T> list, T element);

  public static <T extends Comparable<T>> BinarySearch<T> builder(){
    return new BinarySearchImpl<T>();
  }

}
