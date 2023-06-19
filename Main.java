public class Main {

	public static void main(String[] args) {

		MultiGraph mg = new MultiGraph();
		Vertex v1 = mg.addVertex("A");
		Vertex v2 = mg.addVertex("B");
		Edge e1 = mg.addEdge(2, v1, v2);
		v1.add(e1);
		v2.add(e1);
		System.out.println(mg);
	}

}
