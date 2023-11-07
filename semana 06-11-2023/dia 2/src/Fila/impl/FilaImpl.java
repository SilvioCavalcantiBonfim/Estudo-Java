package Fila.impl;

import java.util.LinkedList;
import java.util.List;
import Fila.Fila;

public class FilaImpl<T> implements Fila<T> {

  private List<T> fila;

  public FilaImpl(){
    fila = new LinkedList<>();
  }

  @Override
  public void enqueue(T item) {
    fila.addFirst(item);
  }

  @Override
  public T dequeue() {
    T first = fila.getLast();
    fila.removeLast();
    return first;
  }

  @Override
  public String toString() {
    return fila.toString();
  }
  
  
}
