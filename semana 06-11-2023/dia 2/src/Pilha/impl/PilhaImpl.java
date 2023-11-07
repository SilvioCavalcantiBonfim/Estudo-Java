package Pilha.impl;

import java.util.LinkedList;
import java.util.List;
import Pilha.Pilha;

public class PilhaImpl<T> implements Pilha<T> {

  private List<T> pilha;

  public PilhaImpl(){
    pilha = new LinkedList<T>();
  }

  @Override
  public void push(T item) {
    pilha.addFirst(item);
  }

  @Override
  public void pop() {
    pilha.removeFirst();
  }

  @Override
  public String toString() {
    return pilha.toString();
  }

  @Override
  public T observe() {
    return pilha.getFirst();
  }
  
  
}
