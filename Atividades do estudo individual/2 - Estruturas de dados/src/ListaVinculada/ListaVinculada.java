package ListaVinculada;

import ListaVinculada.impl.ListaVinculadaImpl;

public interface ListaVinculada<T> {
  public void adicionar(T item);
  public void remover(T item);

  public static <T> ListaVinculada<T> builder(){
    return new ListaVinculadaImpl<T>();
  }
}
