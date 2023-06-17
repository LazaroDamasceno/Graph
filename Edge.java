public class Edge {
	
	private Vertex firstVertex;
	private Vertex secondVertex;
	private Boolean isDirected;
	private Object data;

	public Edge(Object data, Vertex firstVertex, Vertex secondVertex) {
		this.data = data;
		this.firstVertex = firstVertex;
		this.secondVertex = secondVertex;
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
		return String.format("[%s (%s, %s)]", data, firstVertex.getData(), secondVertex.getData());
	}

}
