package tree.impl;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import tree.Tree;

public class BinaryTree<T extends Comparable<T>> implements Tree<T> {

  private final T rootNode;
  private BinaryTree<T> subtreeLeft;
  private BinaryTree<T> subtreeRight;

  public BinaryTree(T node) {
    Objects.requireNonNull(node);
    this.rootNode = node;
    this.subtreeLeft = null;
    this.subtreeRight = null;
  }


  @Override
  public void insert(T value) {
    Objects.requireNonNull(value);
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
    Objects.requireNonNull(value);
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
    Objects.requireNonNull(value);
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
  public Set<Integer> search(T value) {
    Objects.requireNonNull(value);
    Set<Integer> allLevel = new HashSet<>();
    getVerification(value, this, allLevel, -1);
    return allLevel;
  }

  private void getVerification(T value, BinaryTree<T> tree,Set<Integer> allLevel, int currentLevel) {
    if (tree.getNode().equals(value)) {
      allLevel.add(currentLevel+1);
    }
    if (tree.getSubtreeLeft() != null) {
      getVerification(value,  tree.getSubtreeLeft(), allLevel, currentLevel+1);
    }
    
    if (tree.getSubtreeRight() != null) {
      getVerification(value,  tree.getSubtreeRight(), allLevel, currentLevel+1);
    }
  }

  @Override
  public boolean isLeaf() {
    return subtreeLeft == null && subtreeRight == null;
  }

  @Override
  public String toString() {
    if (isLeaf()) {
      return rootNode.toString();
    }
    return "(" + rootNode + (subtreeLeft != null ? String.format(", (%s)", subtreeLeft)
        : "") + (subtreeRight != null ? String.format(", (%s)", subtreeRight) : "") + ")";
  }

  @Override
  public Set<T> getAllLeaf() {
    Set<T> leaf = new HashSet<T>();
    if (isLeaf()) {
      leaf.add(rootNode);
    }else{
      if (subtreeLeft != null) {
        leaf.addAll(subtreeLeft.getAllLeaf());
      }
      if (subtreeRight != null) {
        leaf.addAll(subtreeRight.getAllLeaf());
      }
    }
    return leaf;
  }

  public List<T> preOrder(Function<T,T> mapFunction, Predicate<T> stopFunction){
    List<T> resultMapFunction = new LinkedList<T>();
    recursivePreOrder(resultMapFunction, this, mapFunction, stopFunction);
    return resultMapFunction;
  }

  public List<T> preOrder(Function<T,T> mapFunction){
    List<T> resultMapFunction = new LinkedList<T>();
    recursivePreOrder(resultMapFunction, this, mapFunction, (T a) -> false);
    return resultMapFunction;
  }

  private void recursivePreOrder(List<T> resultMapFunction, BinaryTree<T> tree, Function<T,T> mapFunction, Predicate<T> stopFunction){
    resultMapFunction.add(mapFunction.apply(tree.getNode()));
    if (tree.getSubtreeLeft() != null && !stopFunction.test(tree.getNode())) {
      recursivePreOrder(resultMapFunction, tree.getSubtreeLeft(), mapFunction, stopFunction);
    }
    if (tree.getSubtreeRight() != null && !stopFunction.test(tree.getNode())) {
      recursivePreOrder(resultMapFunction, tree.getSubtreeRight(), mapFunction,stopFunction);
    }
  }

  public List<T> inOrder(Function<T,T> mapFunction, Predicate<T> stopFunction){
    List<T> resultMapFunction = new LinkedList<T>();
    recursiveInOrder(resultMapFunction, this, mapFunction, stopFunction);
    return resultMapFunction;
  }

  public List<T> inOrder(Function<T,T> mapFunction){
    List<T> resultMapFunction = new LinkedList<T>();
    recursiveInOrder(resultMapFunction, this, mapFunction, (T a) -> false);
    return resultMapFunction;
  }

  private void recursiveInOrder(List<T> resultMapFunction, BinaryTree<T> tree, Function<T,T> mapFunction, Predicate<T> stopFunction){
    if (tree.getSubtreeLeft() != null && !stopFunction.test(tree.getNode())) {
      recursiveInOrder(resultMapFunction, tree.getSubtreeLeft(), mapFunction, stopFunction);
    }
    resultMapFunction.add(mapFunction.apply(tree.getNode()));
    if (tree.getSubtreeRight() != null && !stopFunction.test(tree.getNode())) {
      recursiveInOrder(resultMapFunction, tree.getSubtreeRight(), mapFunction,stopFunction);
    }
  }

  public List<T> posOrder(Function<T,T> mapFunction, Predicate<T> stopFunction){
    List<T> resultMapFunction = new LinkedList<T>();
    recursivePosOrder(resultMapFunction, this, mapFunction, stopFunction);
    return resultMapFunction;
  }

  public List<T> posOrder(Function<T,T> mapFunction){
    List<T> resultMapFunction = new LinkedList<T>();
    recursivePosOrder(resultMapFunction, this, mapFunction, (T a) -> false);
    return resultMapFunction;
  }

  private void recursivePosOrder(List<T> resultMapFunction, BinaryTree<T> tree, Function<T,T> mapFunction, Predicate<T> stopFunction){
    if (tree.getSubtreeLeft() != null && !stopFunction.test(tree.getNode())) {
      recursivePosOrder(resultMapFunction, tree.getSubtreeLeft(), mapFunction, stopFunction);
    }
    if (tree.getSubtreeRight() != null && !stopFunction.test(tree.getNode())) {
      recursivePosOrder(resultMapFunction, tree.getSubtreeRight(), mapFunction,stopFunction);
    }
    resultMapFunction.add(mapFunction.apply(tree.getNode()));
  }

  public T getNode() {
    return this.rootNode;
  }

  public BinaryTree<T> getSubtreeLeft() {
    return this.subtreeLeft;
  }

  public BinaryTree<T> getSubtreeRight() {
    return this.subtreeRight;
  }


  @Override
  public int depth(T value) {
    return search(value).stream().max(Integer::compareTo).orElse(-1);
  }

  @Override
  public Integer height() {
    return getAllLeaf().stream().map(this::depth).max(Integer::compareTo).orElse(0);
  }  
}
