package tree;

public interface Tree<T> {
  boolean isLeafNode();
  void insert(T value);
  boolean search(T value);
}
