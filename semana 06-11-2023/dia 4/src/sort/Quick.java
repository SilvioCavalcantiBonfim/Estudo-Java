package sort;

import sort.impl.QuickImpl;

public interface Quick<T extends Comparable<T>> extends Sort<T> {
  
  public static <T extends Comparable<T>> Quick<T> builder() {
    return new QuickImpl<T>();
  }

}
