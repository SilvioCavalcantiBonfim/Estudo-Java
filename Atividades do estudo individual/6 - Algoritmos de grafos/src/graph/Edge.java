package graph;

public class Edge<T,E extends Comparable<E>> {
  private T vertexA;
  private T vertexB;
  private E weight;
  
  public Edge(T vertexA, T vertexB, E weight) {
    this.vertexA = vertexA;
    this.vertexB = vertexB;
    this.weight = weight;
  }

  public boolean contain(T vertex){
    return this.vertexA.equals(vertex) || this.vertexB.equals(vertex);
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((vertexA == null) ? 0 : vertexA.hashCode());
    result = prime * result + ((vertexB == null) ? 0 : vertexB.hashCode());
    result = prime * result + ((weight == null) ? 0 : weight.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null){
      return false;
    }
    if (getClass() != obj.getClass()){
      return false;
    }
    if (!(obj instanceof Edge<?,?>)) {
      return false;
    }
    @SuppressWarnings("unchecked")
    Edge<T,E> other = (Edge<T,E>) obj;
    return equalsHasVertex(other.getVertexA(), other.getVertexB()) && weight.equals(other.getWeight());
  }

  public boolean equalsHasVertex(T vertexA, T vertexB){
    return (vertexA.equals(vertexA) && vertexB.equals(vertexB)) || (vertexA.equals(vertexB) && vertexB.equals(vertexA));
  }



  public T getVertexA() {
    return vertexA;
  }



  public T getVertexB() {
    return vertexB;
  }

  public T getOtherVertex(T vertex){
    return vertex.equals(this.getVertexA())? this.getVertexB() : this.getVertexA();
  }


  public E getWeight() {
    return weight;
  }

  @Override
  public String toString() {
    return "["+vertexA + ", " + vertexB + ", weight=" + weight + "]";
  }

  
}
