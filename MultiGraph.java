import java.util.ArrayList;
import java.util.List;

public class MultiGraph {
	
	private List<Vertex> vertices;
	private List<Edge> edges;

	public MultiGraph() {
		vertices = new ArrayList<>();
		edges = new ArrayList<>();
	}

	public Vertex addVertex(Object data) {
		Vertex vertex = new Vertex(data);
		vertices.add(vertex);
		return vertex;
	}

	public Edge addEdge(Object data, Vertex v1, Vertex v2) {
		Edge edge = new Edge(data, v1, v2);
		edges.add(edge);
		return edge;
	}

	public void removeVertex(Vertex vertex) {
		vertices.remove(vertex);
		for (int index = 0; index < edges.size(); index++) {
			if (edges.get(index).getFirstVertex().equals(vertex) || edges.get(index).getSecondVertex().equals(vertex)) {
				edges.remove(index);
			}
		}
	}

	public void removeEdge() {

	}

	public List<Vertex> getVertices() {
		return vertices;
	}

	public void setVertices(List<Vertex> vertices) {
		this.vertices = vertices;
	}

	public List<Edge> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (var obj : getEdges()) {
			sb.append(obj.getFirstVertex().getData());
			sb.append(" ------ ");
			sb.append(obj.getData().toString());
			sb.append(" ------ ");
			sb.append(obj.getSecondVertex().getData());
			sb.append("\n");
		}
		return sb.toString();
	}

}
