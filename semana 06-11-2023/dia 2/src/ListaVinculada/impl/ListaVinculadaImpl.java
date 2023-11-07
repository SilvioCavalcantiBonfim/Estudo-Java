package ListaVinculada.impl;
import java.util.LinkedList;
import java.util.List;

import ListaVinculada.ListaVinculada;

/**
 * LinkedListImpl
 */
public class ListaVinculadaImpl<T> implements ListaVinculada<T> {

  private List<T> lista;
  
  public ListaVinculadaImpl(){
    this.lista = new LinkedList<>();
  }

  @Override
  public void adicionar(T item) {
    lista.add(item);
  }

  @Override
  public String toString() {
    return lista.toString();
  }

  @Override
  public void remover(T item) {
    lista.remove(item);
  }
}