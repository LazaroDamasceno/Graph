public class Edge {
	
	private Vertex firstVertex;
	private Vertex secondVertex;
	private Boolean isDirected;
	private Object data;
	private Vertex vertex;

	public Edge(Vertex firstVertex, Vertex secondVertex, Boolean isDirected, Object data, Object firstVertexVData, Object secondVertexVData) {
		this.firstVertex = vertex;
		this.secondVertex = secondVertex;
		this.data = data;
		
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Vertex getFirstVertex() {
		return firstVertex;
	}

	public void setFirstVertex(Vertex firstVertex) {
		this.firstVertex = firstVertex;
	}

	public Vertex getSecondtVertex() {
		return secondtVertex;
	}

	public void setSecondtVertex(Vertex secondtVertex) {
		this.secondtVertex = secondtVertex;
	}

	public Boolean isDirected() {
		return isDirected.equals(true);
	}

	public void setIsDirected(Boolean isDirected) {
		this.isDirected = isDirected;
	}
	
	@Override
	public String toString() {
		return String.format("%s", data);
	}

}
