package graphs;

import java.util.*;

import graphs.BinaryMinHeap.VertexWithWigh;

class Graph<D>{
	class Edge{
		D end;
		int weight;
		public Edge(D end,int weight){
			this.end=end;
			this.weight=weight;
		}
	}
	Map<D,Set<Edge>> hashMap;
	Graph(){
		hashMap=new HashMap<>();
	}
	

	public void addEdge(D start,D end,int weight){
		if(!hashMap.isEmpty() && hashMap.containsKey(start)){
			Edge newEdge=new Edge(end,weight);
			hashMap.get(start).add(newEdge);
		}else{
			Edge newEdge=new Edge(end,weight);	
			Set<Edge> newSet=new HashSet<>();
			newSet.add(newEdge);
			hashMap.put(start, newSet);
		}
		if(!hashMap.isEmpty() && hashMap.containsKey(end)){
			Edge newEdge=new Edge(start,weight);
			hashMap.get(end).add(newEdge);
		}else{
			Edge newEdge=new Edge(start,weight);	
			Set<Edge> newSet=new HashSet<>();
			newSet.add(newEdge);
			hashMap.put(end, newSet);
		}
	}
	
	
}

public class DijkstrasAlgorithms {
	
	BinaryMinHeap minHeap=new BinaryMinHeap();
	
	public void processGraph(Graph<Character> g,char start){
		Set<Character> keySet=g.hashMap.keySet();
		for(char c:keySet){
				minHeap.addToMinHeap(c,Integer.MAX_VALUE);	
		}
	}
	
	public HashMap<Character,Integer> calculateMinDistance(Graph<Character> graph,char start){
		processGraph(graph,start);
		HashMap<Character,Integer> distanceMap=new HashMap<>();
		minHeap.decreaseKeyMinHeap(start, 0);
		//distanceMap.put(start, 0);
		while(!minHeap.isEmpty()){
			VertexWithWigh<Character> current=minHeap.poll();
			distanceMap.put(current.key, current.weight);
			char currentVertex=current.key;
			for(Graph<Character>.Edge edge:graph.hashMap.get(currentVertex)){
				char adjVertex=edge.end;
				if(!minHeap.contains(adjVertex)){
					continue;
				}
				int newDistance=current.weight+edge.weight;
				if(newDistance<minHeap.get(adjVertex).weight){
					minHeap.decreaseKeyMinHeap(edge.end, newDistance);
				}
			}
		}
		return distanceMap;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph<Character> graph=new Graph<>();
		graph.addEdge('A', 'B', 5);
		graph.addEdge('A', 'D', 9);
		graph.addEdge('A', 'E', 2);
		graph.addEdge('B', 'C', 2);
		graph.addEdge('C', 'D', 3);
		graph.addEdge('E', 'F', 3);
		graph.addEdge('D', 'F', 2);
		DijkstrasAlgorithms obj=new DijkstrasAlgorithms();
		
		System.out.println(obj.calculateMinDistance(graph, 'D'));
		//System.out.println(graph.hashMap.toString());
		
		
		
	}

}
