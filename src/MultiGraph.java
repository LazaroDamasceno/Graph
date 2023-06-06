import java.util.*;

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
		//Edge edge = Edge.createNewInstance(data);
	}

	@Override
	public String toString() {
		return vertices
			.keySet()
			.toString();
	}
	
}
