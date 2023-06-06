import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Collection;
import java.util.HashMap;

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
		Edge edge = Edge.createNewInstance(data);
	}

	@Override
	public String toString() {
		return vertices.keySet().stream().collect(Collectors.toMap(k -> k, v -> v.));
	}
	
}
