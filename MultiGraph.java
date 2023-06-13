import java.util.List;

public class MultiGraph {
	
	private List<Vertex> vertices;
	private List<Edge> edges;
	
	public void addVertex(Object data) {
		vertices.add(new Vertex(data));
	}

	public void addEdge(Object data, Vertex v1, Vertex v2) {
		edges.add(new Edge(data, v1, v2));
	}

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
