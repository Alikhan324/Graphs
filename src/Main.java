public class Main {

    public static void main(String[] args) {

        WeightedGraph<String> graph =
                new WeightedGraph<>();

        Vertex<String> A = new Vertex<>("A");
        Vertex<String> B = new Vertex<>("B");
        Vertex<String> C = new Vertex<>("C");
        Vertex<String> D = new Vertex<>("D");

        graph.addVertex(A);
        graph.addVertex(B);
        graph.addVertex(C);
        graph.addVertex(D);

        graph.addEdge(A, B, 5);
        graph.addEdge(A, C, 2);
        graph.addEdge(B, D, 1);
        graph.addEdge(C, D, 7);

        BreadthFirstSearch<String> bfs =
                new BreadthFirstSearch<>();

        bfs.search(A);

        System.out.println("BFS:");
        System.out.println(bfs.getTraversal());

        DijkstraSearch<String> dijkstra =
                new DijkstraSearch<>();

        dijkstra.search(A);

        System.out.println("Dijkstra distances:");
        System.out.println(dijkstra.getDistances());
    }
}