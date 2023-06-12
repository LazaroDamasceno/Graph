import java.util.List;

public class MultiGraph {
	
	private List<Vertex> vertices;
	private List<Edge> edges;
	
	public List<Vertex> getV() {
		return vertices;
	}

	public void setV(List<Vertex> vertices) {
		this.vertices = vertices;
	}

	public List<Edge> getE() {
		return edges;
	}

	public void setE(List<Edge> edges) {
		this.edges = edges;
	}
	
}
