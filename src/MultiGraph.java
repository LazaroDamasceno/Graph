import java.util.*;
import java.util.stream.Collectors;

public class MultiGraph {
	
	private Map<Object, List<Edge>> vertices;
	private Vertex vertex;
	
	private MultiGraph() {
		this.vertices = new HashMap<>();
	}
	
	public static MultiGraph createNewInstance() {
		return new MultiGraph();
	}
	
	public void addVertex(Object data) {
		vertex = Vertex.createNewInstance(data); 
		vertices.put(data, vertex.getEdges());
	}
	
	public void addEdge(Object key, Object data) {
		vertices.get(key).add(Edge.createNewInstance(data));
	}

	public void removeVertex(Object key) {
		vertices.remove(key);
	}

	public void removeLastEdge(Object key) {
		int firstIndex = vertices.size()-1;
		vertices.get(key).remove(firstIndex);
	}

	public void removeFirstEdge(Object key) {
		vertices.get(key).remove(0);
	}

	public void removeEdgeByIndex(Object key, int index) {
		if (!vertices.get(key).isEmpty() || vertices.containsKey(key)) {
			vertices.get(key).remove(index);
		}
	}

	@Override
	public String toString() {
		return vertices
			.keySet()
			.stream()
			.collect(
				Collectors.toMap(
					k -> k, 
					v -> vertices.get(v)
			))
			.toString();
	}
	
}
