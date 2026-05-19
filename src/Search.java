import java.util.*;

public abstract class Search<V> {

    protected Map<Vertex<V>, Boolean> visited = new HashMap<>();
    protected List<Vertex<V>> traversal = new ArrayList<>();

    public abstract void search(Vertex<V> start);

    public List<Vertex<V>> getTraversal() {
        return traversal;
    }
}