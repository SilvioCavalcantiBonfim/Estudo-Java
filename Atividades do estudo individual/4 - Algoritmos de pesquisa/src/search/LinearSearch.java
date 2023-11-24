package search;

import search.impl.LinearSearchImpl;

public interface LinearSearch extends Search{

  public static Search builder(){
    return new LinearSearchImpl();
  }

}
