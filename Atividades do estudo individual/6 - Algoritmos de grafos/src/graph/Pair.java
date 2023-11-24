package graph;

class Pair<T> implements Comparable<Pair<T>> {

  private T vertex;
  private Integer priority;

  public Pair(T vertex, Integer priority) {
    this.vertex = vertex;
    this.priority = priority;
  }

  public Integer getPriority() {
    return priority;
  }

  public void updatePriority(Integer priority) {
    this.priority = priority;
  }

  @Override
  public int compareTo(Pair<T> o) {
    return Integer.compare(priority, o.getPriority());
  }

  public T getVertex() {
    return vertex;
  }

  @Override
  public String toString() {
    return "Pair [vertex=" + vertex + ", priority=" + priority + "]";
  }

  

}