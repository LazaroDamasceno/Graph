public class Edge {
	
	private Vertex firstVertex;
	private Vertex secondtVertex;
	private Boolean isDirected;
	private Object data;
	
	public Edge(Object data) {
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
