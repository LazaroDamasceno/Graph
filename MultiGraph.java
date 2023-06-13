import java.util.List;

public class MultiGraph {
	
	private List<Vertex> vertices;
	private List<Edge> edges;
	
	public List<Vertex> getVertices() {
		return vertices;
	}

	public List<Edge> getEdges() {
		return edges;
	}

	public void setVertices(List<Vertex> vertices) {
		this.vertices = vertices;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}
	
}
