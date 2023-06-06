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

	/*
	 * Adding methods
	 */
	
	public void addVertex(Object data) {
		vertex = Vertex.createNewInstance(data); 
		vertices.put(data, vertex.getEdges());
	}
	
	public void addEdge(Object key, Object data) {
		vertices.get(key).add(Edge.createNewInstance(data));
	}

	/*
	 * Revoming methods
	 */

	public void removeVertex(Object key) {
		vertices.remove(key);
	}

	public void removeLastEdge(Object key) {
		int lastIndex = vertices.size()-1;
		vertices.get(key).remove(lastIndex);
	}

	public void removeFirstEdge(Object key) {
		vertices.get(key).remove(0);
	}

	public void removeEdgeByIndex(Object key, int index) {
		if (!vertices.get(key).isEmpty() || vertices.containsKey(key)) {
			vertices.get(key).remove(index);
		}
	}

	/*
	* Replacement methods
	*/

	public void replaceVertex() {}
	
	public void replaceEdge() {}

	/*
	 * Getting methods
	 */

	public Set<Object> getAllVertices() {
		return vertices.keySet();
	}

	public List<Object> getAllEdges() {
		return vertices
			.keySet()
			.stream()
			.map(e -> vertices.get(e))
			.collect(Collectors.toList());
	}

	/*
	 * Prining methods
	 */

	@Override
	public String toString() {
		return vertices
			.keySet()
			.stream()
			.collect(
				Collectors.toMap(
					key -> key, 
					value -> vertices.get(value)
			))
			.toString();
	}
	
}
