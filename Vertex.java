import java.util.*;

public class Vertex {
	
	private List<Edge> edges;
	
	private Vertex(Object data) {
		edges = new ArrayList<>();
	}
	
	public static Vertex createNewInstance(Object data) {
		return new Vertex(data);
	}
	
	public List<Edge> getEdges() {
		return edges;
	}

	@Override
	public String toString() {
		return edges.toString();
	}

}
