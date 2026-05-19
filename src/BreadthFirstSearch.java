import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<V> extends Search<V> {

    @Override
    public void search(Vertex<V> start) {

        Queue<Vertex<V>> queue = new LinkedList<>();

        queue.add(start);
        visited.put(start, true);

        while (!queue.isEmpty()) {

            Vertex<V> current = queue.poll();

            traversal.add(current);

            for (Vertex<V> neighbor :
                    current.getAdjacentVertices().keySet()) {

                if (!visited.containsKey(neighbor)) {

                    visited.put(neighbor, true);
                    queue.add(neighbor);
                }
            }
        }
    }
}