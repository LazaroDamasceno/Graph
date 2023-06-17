import java.util.ArrayList;
import java.util.List;

public class MultiGraph {
	
	private List<Vertex> vertices;
	private List<Edge> edges;

	public MultiGraph() {
		vertices = new ArrayList<>();
		edges = new ArrayList<>();
	}

	public void addVertex(Vertex vertex) {
		vertices.add(vertex);
	}

	public void addEdge(Edge edge) {
		edges.add(edge);
	}

	public List<Vertex> getVertices() {
		return vertices;
	}

	public List<Edge> getEdges() {
		return edges;
	}

	public void setVertices(List<Vertex> vertices) {
		this.vertices = vertices;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (var obj : edges) {
			sb.append("----------------");
			sb.append("v1");
			sb.append(obj.getFirstVertex());
			sb.append(" ------ ");
			sb.append(obj.getData().toString());
			sb.append(" ------ ");
			sb.append(obj.getSecondVertex());
			sb.append("----------------\n");
		}
		return sb.toString();
	}

}
