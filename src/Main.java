
public class Main {

	public static void main(String[] args) {
		MultiGraph graph = MultiGraph.createNewInstance();
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addEdge(1, "A");
		graph.addEdge(1, "B");
		graph.addEdge(2, "C");
		graph.addEdge(2, "A");
		graph.addEdge(2, "B");
		graph.addEdge(3, "A");
		graph.addEdge(3, "B");
		graph.addEdge(3, "C");
		System.out.println(graph);
	}

}
