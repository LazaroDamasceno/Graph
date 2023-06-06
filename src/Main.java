
public class Main {

	public static void main(String[] args) {
		MultiGraph graph = MultiGraph.createNewInstance();
		graph.addVertex(1);
		graph.addEdge(1, 100);
		graph.addEdge(1, 200);
		graph.addEdge(1, 300);
		System.out.println(graph);
		graph.addVertex(2);
		graph.addEdge(2, 100);
		graph.addEdge(2, 200);
		graph.addEdge(2, 300);
		System.out.println(graph);
		graph.removeVertex(1);
		graph.removeFirstEdge(2);
		graph.removeLastEdge(2);
		System.out.println(graph);
		graph.addEdge(2, "A");
		graph.addEdge(2, "B");
		System.out.println(graph);
		graph.addVertex(1);
		System.out.println(graph);
	}

}
