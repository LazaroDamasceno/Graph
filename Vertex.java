import java.util.*;

public class Vertex {
	
	private List<Edge> edges;
	
	public Vertex(Object data) {
		edges = new ArrayList<>();
	}
	
	public List<Edge> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	@Override
	public String toString() {
		return edges.toString();
	}

}
