
public class Main {

	public static void main(String[] args) {
		MultiGraph graph = MultiGraph.createNewInstance();
		graph.addVertex(1);
		graph.addEdge(1, 100);
		graph.addEdge(1, 200);
		graph.addEdge(1, 300);
		graph.addVertex(2);
		graph.addEdge(2, 100);
		graph.addEdge(2, 200);
		graph.addEdge(2, 300);
		graph.replaceEdge(1, 100, 400);
		System.out.println(graph);
	}

}
