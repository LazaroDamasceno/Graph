import java.util.*;

public class Vertex {
	
	private Object data;
	private List<Edge> edges;
	
	public Vertex(Object data) {
		this.data = data;
		edges = new ArrayList<>();
	}

	public void add(Edge edge) {

	}

	public void remove(Object data) {
		
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
