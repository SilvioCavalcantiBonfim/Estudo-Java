import graph.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        // definição do grafo
        Graph<Character, Integer> graph = new Graph<>(); 

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');

        graph.addEdge('A', 'B', 6);
        graph.addEdge('A', 'D', 1);
        graph.addEdge('B', 'D', 2);
        graph.addEdge('B', 'C', 5);
        graph.addEdge('B', 'E', 2);
        graph.addEdge('D', 'E', 1);
        graph.addEdge('C', 'E', 5);
        
        Character start = 'A';

        System.out.printf("Vizinhança de %c: "+graph.getNeighborhood(start), start);
        System.out.printf("\nConjunto de adjacencia de %c: "+graph.getSetAdjacency(start), start);

        // algoritmo de Dijkstra

        Dijkstra<Character> dijkstra = new Dijkstra<>(graph, start);

        System.out.printf("\nMenor distância do vértice %c para cada um dos vértices: "+ dijkstra.runAll()+"\n", start);

    }
}
