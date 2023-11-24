package sort;

import sort.impl.BubbleImpl;

public interface Bubble<T extends Comparable<T>> extends Sort<T> {

  public static <T extends Comparable<T>> Bubble<T> builder(){
    return new BubbleImpl<T>();
  }
}
