package graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

class graphLocal{
	HashMap<Character,LinkedList<Character>> adjacencyList = new HashMap<>();
	public void addVertex(char vertex,char edge){

		if(!adjacencyList.isEmpty() && adjacencyList.containsKey(vertex)){
			if(!adjacencyList.get(vertex).contains(edge)){
				adjacencyList.get(vertex).add(edge);
			}
		}else{
			LinkedList<Character> adjacent= new LinkedList<>();
			adjacent.add(edge);
			adjacencyList.put(vertex, adjacent);
		}if(!adjacencyList.isEmpty() && adjacencyList.containsKey(edge)){
			if(!adjacencyList.get(edge).contains(vertex)){
				adjacencyList.get(edge).add(vertex);
			}
		}else{
			LinkedList<Character> adjacent= new LinkedList<>();
			adjacent.add(vertex);
			adjacencyList.put(edge, adjacent);
		}
		
	}
}

public class CycleDetection {
	
	public static boolean cycleDetect(graphLocal g,Set<Character> visited,char goingTo,char comingFrom){
		if(!visited.isEmpty() && visited.contains(goingTo)){
			System.out.println("cycle detected at "+goingTo);
			return true;
		}
		else{
			visited.add(goingTo);
			System.out.println(goingTo);
			Iterator<Character> itr=g.adjacencyList.get(goingTo).iterator();
			while(itr.hasNext()){
				char current=itr.next();
				if(comingFrom==' ' ||  current!=comingFrom){
					if(cycleDetect(g, visited, current, goingTo)){
						return true;
					}
				}
			}
			return false;
		}
		
		
	}
	public static void dfs(graphLocal g,char vertex){
		Set<Character> visited = new HashSet<>();
		if(cycleDetect(g, visited, vertex, ' ')){
			System.out.println("cycle detected");
		}else{
			System.out.println("no cycle detected");
		}


		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graphLocal g=new graphLocal();
		g.addVertex('A', 'F');
		g.addVertex('A', 'B');
		//g.addVertex('B', 'E');
		g.addVertex('B', 'C');
		g.addVertex('C', 'D');
		g.addVertex('D', 'E');
		//g.addVertex('E', 'B');
		dfs(g,'A');
	}

}
