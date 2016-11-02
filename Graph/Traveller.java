package graphs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Traveller {
	
	HashMap<String, Vertex> vertex=new HashMap<>();
	HashMap<String,Set<Edge>> edge=new HashMap<>();
	
	public static class Vertex{
		String name;
		int inDegree=0;
		int outDegree=0;
		public Vertex(String name){
			this.name=name;
		}
	}
	public static class Edge{
		String start;
		String end;
		boolean visited=false;
		public Edge(String start,String end){
			this.start=start;
			this.end=end;
		}
	}
	public void addEdge(String start,String end){
		Edge newEdge=new Edge(start,end);
		if(!edge.isEmpty() && edge.containsKey(start)){
			edge.get(start).add(newEdge);
		}else{
			Set<Edge> newSet=new HashSet<>();
			newSet.add(newEdge);
			edge.put(start, newSet);
		}if(vertex.containsKey(start)){
			vertex.get(start).outDegree++;	
			
		}else{
			Vertex newVertex=new Vertex(start);
			newVertex.outDegree++;
			vertex.put(start, newVertex);
		}
		if(vertex.containsKey(end)){
			vertex.get(end).inDegree++;
				
		}else{
			Vertex newVertex=new Vertex(end);
			newVertex.inDegree++;
			vertex.put(end, newVertex);
		}	
	}
	

	
	public String findStartStation(){
		
		Collection<Vertex> vertexCollection=vertex.values();
		Set<Vertex> vertexSet=new HashSet<>(vertexCollection);
		for(Vertex v: vertexSet){
			if(v.inDegree==0){
				return v.name;
			}
		}
		return "No head";
	}
	
	public void dfs(String start){
		System.out.print(start+"->");
		if(edge.containsKey(start)){
			for(Edge adj:edge.get(start)){
				if(!adj.visited){
					adj.visited=true;
					dfs(adj.end);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traveller g=new Traveller();
		g.addEdge("LAX", "ATL");
		g.addEdge("ATL", "DEN");
		g.addEdge("DEN", "BOS");
		g.addEdge("BOS", "JFK");
		g.addEdge("JFK", "DEN");
		g.addEdge("DEN", "PHL");
		g.addEdge("PHL", "DFW");
		g.addEdge("DFW", "SEA");
        g.addEdge("SEA", "DEN");
        g.addEdge("DEN", "HOU");
        g.addEdge("SFO", "LAX");
        g.addEdge("HOU", "MIA");

        System.out.println(g.findStartStation());
        g.dfs(g.findStartStation());
        //g.dfs("SFO");
	}

}
