import java.util.List;
import java.util.ArrayList;

public class Vertex {
	
	private Object data;
	private List<Edge> edges;
	
	private Vertex(Object data) {
		this.data = data;
		edges = new ArrayList<>();
	}
	
	public static Vertex createNewInstance(Object data) {
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

	public List<Edge> getEdges() {
		return edges;
	}

	@Override
	public String toString() {
		return String.format("{vertex=%s | edges=%s}", data, edges);
	}

}
