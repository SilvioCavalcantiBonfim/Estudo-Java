package Fila;

import Fila.impl.FilaImpl;

public interface Fila<T> {
  public void enqueue(T item);
  public T dequeue();

  public static <T> Fila<T> builder(){
    return new FilaImpl<T>();
  }
}
