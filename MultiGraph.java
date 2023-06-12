import java.util.*;
import java.util.stream.Collectors;

public class MultiGraph {
	
	private Map<Object, List<Edge>> vertices;
	
	public MultiGraph() {
		this.vertices = new HashMap<>();
	}

	@Override
	public String toString() {
		return vertices
			.keySet()
			.stream()
			.collect(
				Collectors.toMap(
					key -> key, 
					value -> vertices.get(value)
			))
			.toString();
	}
	
}
