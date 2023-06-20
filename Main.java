public class Main {

	public static void main(String[] args) {
		MultiGraph mg = new MultiGraph();
		// Primeiras adições
		var A = mg.addVertex("A");
		var B = mg.addVertex("B");
		var e1 = mg.addEdge(1, A, B);
		A.add(e1);
		B.add(e1);
		// Segundas adições
		var C = mg.addVertex("C");
		var e2 = mg.addEdge(2, A, C);
		A.add(e2);
		C.add(e2);
		// Terceiras adições
		var D = mg.addVertex("D");
		var e3 = mg.addEdge(3, B, D);
		B.add(e3);
		D.add(e3);
		System.out.println(mg);
		// Remove arresta
		mg.removeEdge(e1);
		System.out.println(mg);
		// Remove vertice
		mg.removeVertex(A);
		System.out.println(mg);
		// Substitui vertice
		mg.replaceVertix(B, "F");
		System.out.println(mg);
		// Substitui arresta
		mg.replaceEdge(e3, 33);
		System.out.println(mg);
		// Mostrando os grafos
		System.out.println(B.getEdges());
		System.out.println(D.getEdges());

 	}

}
