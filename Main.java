public class Main {

	public static void main(String[] args) {

		Vertex v1 = new Vertex("A");
		Vertex v2 = new Vertex("B");
		Edge e1 = new Edge(100, v1, v2);
		v1.add(e1);
		v2.add(e1);
		System.out.println(v1);

		//MultiGraph mg = new MultiGraph();


	}

}
