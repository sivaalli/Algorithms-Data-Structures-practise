package smapleQuestionsAlgorithms;
import java.util.*;

public class RoutePresentDFS {
	static class Graph<T>{
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
	
	private static boolean routeExistsUtil(Graph<String> g,String start,String end,Set<String> visited){
		if(start.equals(end)){
			return true;
		}
		visited.add(start);
		Set<String> adjSet=g.getAdjacentList(start);
		for(String adj:adjSet){
			if(!visited.contains(adj) && routeExistsUtil(g,adj,end,visited)){
				return true;
			}	
		}
		return false;
	}
	
	public static boolean routeExists(Graph<String> g,String start,String end){
		Set<String> visited=new HashSet<>();
		if(routeExistsUtil(g, start, end, visited)){
			return true;
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
		if(routeExists(g,"koti","hyderabad")){
			System.out.println("Route Exists");
		}else{
			System.out.println("Route doesnt exist");
		}
		
		
	}

}
