
import java.util.List;
import java.util.ArrayList;

public class MultiGraph {
	
	private List<Vertex> vertices;
	private Vertex vertex;
	private Edge edge;
	
	private MultiGraph() {
		this.vertices = new ArrayList<>();
	}
	
	public void addVertex(Object data) {
		vertices.add(createNewVertexInstance(data));
	}
	
	private Vertex createNewVertexInstance(Object data) {
		return vertex.createNewInstance(data);
	}
	
	public void addEdge(int index, Object data) {
		vertices.get(index).add(createNewEdgeInstance(index, data));
	}
	
	private Edge createNewEdgeInstance(int index, Object data) {
		return edge.createNewInstance(data);
	}

	@Override
	public String toString() {
		return null;
	}
	
	
	
}
