import java.util.*;
import java.util.stream.*;

public class Vertex {
	
	private Object data;
	private List<Edge> edges;
	
	public Vertex(Object data) {
		this.data = data;
		edges = new ArrayList<>();
	}

	public void add(Edge edge) {
		edges.add(edge);
	}

	public void remove(Edge edge) {
		edges.remove(edge);
	}

	public boolean contains(Edge edge) {
		return edges.contains(edge);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public List<Edge> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	@Override
	public String toString() {
		return String.format("%s: %s", data, edges);
	}

}
