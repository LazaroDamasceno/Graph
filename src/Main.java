import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		MultiGraph graph = MultiGraph.createNewInstance();
		graph.addVertex(1);
		graph.addEdge(1, "A");
		graph.addEdge(1, "B");
		graph.addEdge(1, "C");
		graph.addEdge(1, "D");
		System.out.println(graph);
	}

}
