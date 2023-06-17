import java.util.ArrayList;
import java.util.List;

public class MultiGraph {
	
	private List<Vertex> vertices;
	private List<Edge> edges;

	public MultiGraph() {
		vertices = new ArrayList<>();
		edges = new ArrayList<>();
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
