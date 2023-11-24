package graph;

import java.util.HashSet;
import java.util.Set;

public class Graph<T,E extends Comparable<E>> {

  private Set<T> vertex;

  private Set<Edge<T,E>> edges;

  

  public Graph() {
    this.vertex = new HashSet<>();
    this.edges = new HashSet<>();
  }

  public void addVertex(T vertex){
    this.vertex.add(vertex);
  }

  public void addEdge(T vertexA, T vertexB, E weight){
    if (!vertex.contains(vertexA) || !vertex.contains(vertexB)) {
      throw new IllegalArgumentException("Um dos vértices não faz parte do grafo.");
    }
    this.edges.add(new Edge<T,E>(vertexA, vertexB, weight));
  }

  public Set<T> getNeighborhood(T vertex){
    Set<T> neighborhood = new HashSet<T>();
    for (Edge<T,E> t : this.edges) {
      if (t.contain(vertex)) {
        neighborhood.add(t.getVertexA().equals(vertex)? t.getVertexB(): t.getVertexA());
      }
    }
    return neighborhood;
  }

  public Set<Edge<T,E>> getSetAdjacency(T vertex){
    Set<Edge<T,E>> adjacency = new HashSet<>();
    
    for (Edge<T,E> edge : edges) {
      if (edge.contain(vertex)) {
        adjacency.add(edge);
      }
    }

    return adjacency;
  }

  public Set<T> getVertex() {
    return vertex;
  }

  public Set<Edge<T, E>> getEdges() {
    return edges;
  }
}
