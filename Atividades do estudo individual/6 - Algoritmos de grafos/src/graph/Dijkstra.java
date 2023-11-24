package graph;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Dijkstra<T> {

  private final Graph<T, Integer> graph;
  private final T start;

  public Dijkstra(Graph<T, Integer> graph, T start) {
    this.graph = graph;
    this.start = start;
  }

  public Map<T, Integer> runAll() {
    Set<T> noVisited = graph.getVertex();

    PriorityQueue<Pair<T>> priorityQueue = new PriorityQueue<>();

    priorityQueue.add(new Pair<T>(start, 0));

    Map<T, Integer> result = new HashMap<>();

    while (!noVisited.isEmpty()) {

      final Pair<T> currentAnalysis = priorityQueue.poll();

      if (currentAnalysis == null)
        break;

      processAdjacentVertices(noVisited, priorityQueue, result, currentAnalysis);

    }
    return Collections.unmodifiableMap(result);
  }

  private void processAdjacentVertices(Set<T> noVisited, PriorityQueue<Pair<T>> priorityQueue, Map<T, Integer> result,
      final Pair<T> currentAnalysis) {
    graph.getSetAdjacency(currentAnalysis.getVertex()).forEach((v) -> {

      T u = v.getOtherVertex(currentAnalysis.getVertex());
      boolean contain = contain(priorityQueue, u);
      Integer newWeight = currentAnalysis.getPriority() + v.getWeight();
      List<Pair<T>> currentElement = getCurrentElement(priorityQueue, noVisited, u, contain, newWeight);

      updateResult(result, currentElement);
      updateQueue(priorityQueue, currentElement);
      removeVisited(noVisited, currentAnalysis);
    });
  }

  private void removeVisited(Set<T> noVisited, final Pair<T> currentAnalysis) {
    noVisited.remove(currentAnalysis.getVertex());
  }

  private void updateQueue(PriorityQueue<Pair<T>> priorityQueue, List<Pair<T>> currentElement) {
    priorityQueue.addAll(currentElement);
  }

  private void updateResult(Map<T, Integer> result, List<Pair<T>> currentElement) {
    currentElement.stream().forEach((e) -> result.put(e.getVertex(), e.getPriority()));
  }

  private boolean contain(PriorityQueue<Pair<T>> priorityQueue, T vertex) {
    return priorityQueue.stream().filter((e) -> e.getVertex().equals(vertex)).count() > 0;
  }

  private List<Pair<T>> getCurrentElement(PriorityQueue<Pair<T>> priorityQueue, Set<T> noVisited, T vertex,
      boolean contain, Integer newWeight) {
    List<Pair<T>> currentElement = new LinkedList<>();

    if (contain) {
      currentElement.addAll(priorityQueue.stream()
          .filter((f) -> f.getVertex().equals(vertex))
          .map((f) -> new Pair<T>(f.getVertex(), Integer.min(newWeight, f.getPriority())))
          .toList());

      priorityQueue.removeAll(priorityQueue.stream()
          .filter((f) -> f.getVertex().equals(vertex))
          .toList());
    } else {
      if (noVisited.contains(vertex)) {
        currentElement.add(new Pair<T>(vertex, newWeight));
      }
    }
    return currentElement;
  }
}
