import java.util.*;
import java.util.stream.Collectors;

public class MultiGraph {
	
	private Map<Object, List<Edge>> vertices;
	
	private MultiGraph() {
		this.vertices = new HashMap<>();
	}
	
	public static MultiGraph createNewInstance() {
		return new MultiGraph();
	}

	/*****************************************************
	 * Adding methods
	*****************************************************/
	
	public void addVertex(Object data) {
		vertices.put(data, Vertex.createNewInstance(data).getEdges());
	}
	
	public void addEdge(Object key, Object data) {
		vertices.get(key).add(Edge.createNewInstance(data));
	}

	/*****************************************************
	 * Revoming methods
	*****************************************************/

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
		vertices.get(key).remove(index);
	}

	/*
	* Replacement methods
	*/

	private void replaceValue(Object key, List<Edge> edges) {
		vertices.replace(key, edges);
	}

	public void replaceVertex(Object key, Object newKey) {
		addVertex(newKey);
		replaceValue(newKey, vertices.get(key));
		removeVertex(key);
	}
	
	public void replaceEdge(Object key, int index, Object newData) {
		vertices.get(key).get(index).setData(newData);
	}

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
