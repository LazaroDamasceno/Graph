import java.util.*;
import java.util.stream.*;

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
		List<Edge> removable = edges
			.stream()
			.filter(e -> e.getFirstVertex().equals(vertex) || e.getSecondVertex().equals(vertex))
			.toList();
		edges.removeAll(removable);
	}

	public void removeEdge(Edge edge) {
		int index = edges.indexOf(edge);
		edges.get(index).setData(null);
		for (Vertex vertex : getVertices()) {
			if (vertex.getEdges().contains(edge)) {
				vertex.getEdges().remove(edge);
				break;
			}
		}
	}

	public void replaceDataVertix(Vertex vertex, Object data) {
		vertex.setData(data);
	}

	public void replaceDataEdge(Edge edge, Object data) {
		edge.setData(data);
	}

	public boolean isAdjacent(Vertex v1, Vertex v2) {
		return edges
			.stream()
			.map(e -> e.getFirstVertex().equals(v1) && e.getSecondVertex().equals(v2))
			.toList()
			.contains(true);
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
			sb.append(obj.getData());
			sb.append(" ------ ");
			sb.append(obj.getSecondVertex().getData());
			sb.append("\n");
		}
		return sb.toString();
	}

}
