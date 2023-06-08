public class Main {

	public static void main(String[] args) {
		var graph = MultiGraph.createNewInstance();
		graph.addVertex(1);
		graph.addEdge(1, 1000);
		graph.addEdge(1, 2000);
		graph.addEdge(1, 3000);
		graph.addVertex(3);
		graph.addEdge(3, 4000);
		graph.addEdge(3, 5000);
		graph.addEdge(3, 6000);
		System.out.println(graph);
		graph.replaceVertex(1, 5);
		System.out.println(graph);
		graph.replaceEdge(3, 0,"A");
		System.out.println(graph);
	}

}
