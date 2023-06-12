import java.util.*;

public class Vertex {
	
	private List<Edge> edges;
	
	public Vertex(Object data) {
		edges = new ArrayList<>();
	}
	
	public List<Edge> getEdges() {
		return edges;
	}

	@Override
	public String toString() {
		return edges.toString();
	}

}
