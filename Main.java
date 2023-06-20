public class Main {

	public static void main(String[] args) {
		MultiGraph mg = new MultiGraph();
		// Primeiras adições
		var v1 = mg.addVertex("A");
		var v2 = mg.addVertex("B");
		var e1 = mg.addEdge(1, v1, v2);
		v1.add(e1);
		v2.add(e1);
		// Segundas adições
		var v3 = mg.addVertex("C");
		var e2 = mg.addEdge(2, v1, v3);
		v1.add(e2);
		v3.add(e2);
		// Terceiras adições
		var v4 = mg.addVertex("D");
		var e3 = mg.addEdge(3, v2, v4);
		v2.add(e3);
		v4.add(e3);
		System.out.println(mg);
		// Remove arresta
		mg.removeEdge(e1);
		System.out.println(mg);
		// Remove vertice
		mg.removeVertex(v1);
		System.out.println(mg);
		// Substitui vertice
		mg.replaceDataVertix(v2, "F");
		System.out.println(mg);
		// Substitui arresta
		mg.replaceDataEdge(e3, 33);
		System.out.println(mg);
		// Mostrando os grafos
		mg.isAdjacent(v2, v4);

 	}

}
