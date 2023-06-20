public class Main {

	public static void main(String[] args) {
		MultiGraph mg = new MultiGraph();

		var A = mg.addVertex("A");
		var B = mg.addVertex("B");
		var e1 = mg.addEdge(1, A, B);
		A.add(e1);
		B.add(e1);

		var C = mg.addVertex("C");
		var e2 = mg.addEdge(2, A, C);
		A.add(e2);
		C.add(e2);
		System.out.println(mg);

		var D = mg.addVertex("D");
		var e3 = mg.addEdge(3, B, D);
		B.add(e3);
		D.add(e3);
		System.out.println(mg);

		mg.removeVertex(A);
		System.out.println(mg);
 	}

}
