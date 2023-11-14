package tree;

import java.util.Set;

public interface Tree<T> {
  boolean isLeaf();
  void insert(T value);
  Set<Integer> search(T value);
  Set<T> getAllLeaf();
  int depth(T value);
  Integer height();
}
