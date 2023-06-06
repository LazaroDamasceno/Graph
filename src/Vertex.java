
import java.util.List;
import java.util.ArrayList;

public class Vertex {
	
	private Object data;
	private List<Edge> edges;
	
	private Vertex(Object data) {
		this.data = data;
		this.edges = new ArrayList<>();
	}
	
	public Vertex createNewInstance(Object data) {
		return new Vertex(data);
	}
	
	public void add(Edge input) {
		edges.add(input);
	}
	
	public void remove(Edge input) {
		edges.remove(input);
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
		return String.format("vertex's data = %s | edge's list = %s", data, edges);
	}

}
