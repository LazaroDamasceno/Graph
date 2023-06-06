import java.util.*;

public class Vertex {
	
	private List<Edge> edges;
	
	private Vertex(Object data) {
		edges = new ArrayList<>();
	}
	
	public static Vertex createNewInstance(Object data) {
		return new Vertex(data);
	}
	
	public void add(Object data) {
		edges.add(Edge.createNewInstance(data));
	}
	
	public void remove(Edge input) {
		edges.remove(input);
	}
	
	public List<Edge> getEdges() {
		return edges;
	}

	@Override
	public String toString() {
		return edges.toString();
	}

}
