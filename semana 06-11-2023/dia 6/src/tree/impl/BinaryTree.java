package tree.impl;

import tree.Tree;

public class BinaryTree<T extends Comparable<T>> implements Tree<T> {

  private final T rootNode;
  private BinaryTree<T> subtreeLeft;
  private BinaryTree<T> subtreeRight;

  public BinaryTree(T node) {
    if (node == null) {
      throw new IllegalArgumentException("O nó não pode ser nulo.");
    }
    this.rootNode = node;
    this.subtreeLeft = null;
    this.subtreeRight = null;
  }

  @Override
  public void insert(T value) {
    if (value == null) {
      throw new IllegalArgumentException("Um nó não pode ser nulo.");
    }
    int compare = rootNode.compareTo(value);
    if (compare > 0) {
      if (subtreeLeft == null) {
        subtreeLeft = new BinaryTree<T>(value);
      }else{
        subtreeLeft.insert(value);
      }
    }
    if (compare < 0) {
      if (subtreeRight == null) {
        subtreeRight = new BinaryTree<T>(value);
      }else{
        subtreeRight.insert(value);
      }
    }
  }

  public boolean insertLeft(T node, T value) {
    if (value == null) {
      throw new IllegalArgumentException("Um nó não pode ser nulo.");
    }
    boolean resultInsertion = false;
    if (node == rootNode && subtreeLeft == null) {
      this.subtreeLeft = new BinaryTree<T>(value);
      resultInsertion = true;
    }
    if (!resultInsertion && subtreeLeft != null) {
      resultInsertion |= subtreeLeft.insertLeft(node, value);
    }
    if (!resultInsertion && subtreeRight != null) {
      resultInsertion |= subtreeRight.insertLeft(node, value);
    }
    return resultInsertion;
  }

  public boolean insertRight(T node, T value) {
    if (value == null) {
      throw new IllegalArgumentException("Um nó não pode ser nulo.");
    }
    boolean resultInsertion = false;
    if (node == rootNode && subtreeRight == null) {
      this.subtreeRight = new BinaryTree<T>(value);
      return true;
    }
    if (!resultInsertion && subtreeLeft != null) {
      resultInsertion |= subtreeLeft.insertRight(node, value);
    }
    if (!resultInsertion && subtreeRight != null) {
      resultInsertion |= subtreeRight.insertRight(node, value);
    }
    return resultInsertion;
  }

  @Override
  public boolean search(T value) {
    if (value == null) {
      return false;
    }
    boolean verification = false;
    verification |= rootNode.equals(value);
    if (!verification && subtreeLeft != null) {
      verification |= subtreeLeft.search(value);
    }
    if (!verification && subtreeRight != null) {
      verification |= subtreeRight.search(value);
    }
    return verification;
  }

  @Override
  public boolean isLeafNode() {
    return subtreeLeft == null && subtreeRight == null;
  }

  @Override
  public String toString() {
    if (isLeafNode()) {
      return rootNode.toString();
    }
    return "[" + rootNode + (subtreeLeft != null ? String.format(", L%s", subtreeLeft)
        : "") + (subtreeRight != null ? String.format(", R%s", subtreeRight) : "") + "]";
  }
}
