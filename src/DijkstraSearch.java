import java.util.*;

public class DijkstraSearch<V> extends Search<V> {

    private Map<Vertex<V>, Double> distances = new HashMap<>();

    @Override
    public void search(Vertex<V> start) {

        PriorityQueue<Vertex<V>> pq =
                new PriorityQueue<>(
                        Comparator.comparingDouble(distances::get)
                );

        distances.put(start, 0.0);

        pq.add(start);

        while (!pq.isEmpty()) {

            Vertex<V> current = pq.poll();

            traversal.add(current);

            for (Map.Entry<Vertex<V>, Double> entry :
                    current.getAdjacentVertices().entrySet()) {

                Vertex<V> neighbor = entry.getKey();
                double weight = entry.getValue();

                double newDistance =
                        distances.get(current) + weight;

                if (!distances.containsKey(neighbor)
                        || newDistance < distances.get(neighbor)) {

                    distances.put(neighbor, newDistance);

                    pq.add(neighbor);
                }
            }
        }
    }

    public Map<Vertex<V>, Double> getDistances() {
        return distances;
    }
}