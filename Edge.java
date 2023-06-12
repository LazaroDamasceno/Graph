public class Edge {
	
	private Vertex firstVertex;
	private Vertex secondVertex;
	private Boolean isDirected;
	private Object data;

	public Edge(Object data, Object dataFirstVertex, Object dataSecondVertex) {
		this.data = data;
		this.firstVertex = new Vertex(dataFirstVertex);
		this.secondVertex = new Vertex(dataSecondVertex);
	}
	
	public Vertex getFirstVertex() {
		return firstVertex;
	}

	public void setFirstVertex(Vertex firstVertex) {
		this.firstVertex = firstVertex;
	}

	public Vertex getSecondVertex() {
		return secondVertex;
	}

	public void setSecondVertex(Vertex secondVertex) {
		this.secondVertex = secondVertex;
	}

	public Boolean getIsDirected() {
		return isDirected;
	}

	public void setIsDirected(Boolean isDirected) {
		this.isDirected = isDirected;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return String.format("%s", data);
	}

}
