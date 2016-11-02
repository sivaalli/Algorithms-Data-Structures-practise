package smapleQuestionsAlgorithms;

import java.util.*;

class Graph<T>{
	//undirected graph
	private HashMap<T,Set<T>> hashMap=new HashMap<>();
	public void addEdge(T start,T end){
		if(hashMap.containsKey(start)){
			hashMap.get(start).add(end);
		}else{
			Set<T> adj=new HashSet<>();
			adj.add(end);
			hashMap.put(start, adj);
		}
		if(hashMap.containsKey(end)){
			hashMap.get(end).add(start);
		}else{
			Set<T> adj=new HashSet<>();
			adj.add(start);
			hashMap.put(end, adj);
		}
	}
	public Set<T> getAdjacentList(T start){
		return hashMap.get(start);
	}
	public Set<T> getVertexList(){
		return hashMap.keySet();
	}
}

public class RoutePresentBFS {

	public static boolean isRoutePresent(Graph<String> g,String start,String end){
		Queue<String> queue=new LinkedList<>();	
		Set<String> visited=new HashSet<>();
		queue.add(start);
		visited.add(start);
		while(!queue.isEmpty()){
			String current=queue.remove();
			for(String adj: g.getAdjacentList(current)){
				System.out.println(adj);
				if(!visited.contains(adj)){
					if(adj.equals(end)){
						return true;
					}
					//System.out.println("added ");
					visited.add(adj);
					queue.add(adj);
				}
				
			}
		}
		return false;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph<String> g=new Graph<>();
		g.addEdge("hyderabad", "bawarchi");
		g.addEdge("bawarchi", "sandhya");
		g.addEdge("hyderabad", "paradise");
		g.addEdge("hyderabad", "gokulChat");
		g.addEdge("sandhya", "devi");
		g.addEdge("paradise", "station");
		g.addEdge("station", "mancherial");
		g.addEdge("gokulChat", "abids");
		g.addEdge("abids", "koti");
		g.addEdge("godavarakani", "srirampur");
		if(isRoutePresent(g, "hyderabad", "mancherial")){
			System.out.println("route present");
		}
	}

}
