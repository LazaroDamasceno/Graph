
public class Main {

	public static void main(String[] args) {
		MultiGraph graph = MultiGraph.createNewInstance();

		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);

		graph.addEdge(1, "A");
		graph.addEdge(1, "B");
		graph.addEdge(1, "C");

		graph.addEdge(2, "C");
		graph.addEdge(2, "D");
		graph.addEdge(2, "E");

		graph.addEdge(3, "F");
		graph.addEdge(3, "G");
		graph.addEdge(3, "H");

		System.out.println(graph);
	}

}
