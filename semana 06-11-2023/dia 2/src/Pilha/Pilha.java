package Pilha;

import Pilha.impl.PilhaImpl;

public interface Pilha<T> {
  public void push(T item);
  public void pop();
  public T observe();

  public static <T> Pilha<T> builder(){
    return new PilhaImpl<T>();
  }
}
