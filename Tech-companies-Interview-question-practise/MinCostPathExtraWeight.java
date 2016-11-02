package smapleQuestionsAlgorithms;

import java.awt.Adjustable;
import java.awt.event.WindowEvent;
import java.util.*;

import graphs.DijkstrasAlgorithms;
import smapleQuestionsAlgorithms.BinaryMinHeap.vertex;
import smapleQuestionsAlgorithms.GraphWithWeight.Edge;

class GraphWithWeight<T>{
	class Edge{
		T start;
		T end;
		int weight;
		Edge(T start, T end, int weight){
			this.start=start;
			this.end=end;
			this.weight=weight;
		}
	}
	HashMap<T,Set<Edge>> hashMap=new HashMap<>();
	public void addEdge(T start,T end,int weight){
	
		if(hashMap.containsKey(start)){
			Edge newEdge= new Edge(start,end,weight);
			hashMap.get(start).add(newEdge);
		}else{
			Set<Edge> adjacentSet=new HashSet<>();
			Edge newEdge=new Edge(start,end,weight);
			adjacentSet.add(newEdge);
			hashMap.put(start, adjacentSet);
		}
		//Undirected graph
		if(hashMap.containsKey(end)){
			Edge newEdge= new Edge(end,start,weight);
			hashMap.get(end).add(newEdge);
		}else{
			Set<Edge> adjacentSet=new HashSet<>();
			Edge newEdge=new Edge(end,start,weight);
			adjacentSet.add(newEdge);
			hashMap.put(end, adjacentSet);
		}
	}
	public Set<T> getVertex(){
		return hashMap.keySet();
	} 
	public Set<GraphWithWeight<T>.Edge> getAdjacent(T vertexNo){
		return hashMap.get(vertexNo);
	}
	public int noOfVertex(){
		return hashMap.size();
	}
}
class BinaryMinHeap{
	public static class vertex{
		int vertexNo;
		int weightTo;
		vertex(int vertexNo,int weightTo){
			this.vertexNo=vertexNo;
			this.weightTo=weightTo;
		}
	}
	PriorityQueue<vertex> minHeap= new PriorityQueue<>(new Comparator<vertex>(){

		@Override
		public int compare(vertex o1, vertex o2) {
			// TODO Auto-generated method stub
			if(o1.weightTo>o2.weightTo){
				return 1;
			}else if(o1.weightTo<o2.weightTo){
				return -1;
			}
			return 0;
		}});
	HashMap<Integer,vertex> hashMap=new HashMap<>();
	
	public void add(int vertexNo,int weight){
		vertex newVertex=new vertex(vertexNo,weight);
		hashMap.put(vertexNo,newVertex );
		minHeap.add(newVertex);
	}
	public boolean contains(int vertexNo){
		return hashMap.containsKey(vertexNo);
	}
	public void decreaseKey(int vertexNo,int weightTo){
		vertex newVertex=new vertex(vertexNo, weightTo);
		minHeap.remove(hashMap.get(vertexNo));
		hashMap.put(vertexNo, newVertex);
		minHeap.add(newVertex);
	}
	public vertex poll(){
		vertex polledVertex=minHeap.poll();
		hashMap.remove(polledVertex.vertexNo);
		return polledVertex;
		
	}
	public boolean isEmpty(){
		return hashMap.isEmpty();
	}
	public int getWeight(int vertexNo){
		return hashMap.get(vertexNo).weightTo;
	}
}
public class MinCostPathExtraWeight {
	
	private BinaryMinHeap processGraph(GraphWithWeight<Integer> g){
		BinaryMinHeap minHeap=new BinaryMinHeap();
		for(int vertexNo:g.getVertex()){
			minHeap.add(vertexNo, Integer.MAX_VALUE);
		}
		return minHeap;
	}

	public HashMap<Integer,Integer> dijkstrasAlgo(GraphWithWeight<Integer> g,int start){
		HashMap<Integer,Integer> distance=new HashMap<>();
		BinaryMinHeap minHeap=processGraph(g);
		minHeap.decreaseKey(start, 0);
		distance.put(start, 0);
		while(!minHeap.isEmpty()){
			vertex current=minHeap.poll();
			System.out.println(current);
			int vertexNo=current.vertexNo;
			int weight=current.weightTo;
			System.out.println(weight);
			
			distance.put(vertexNo, weight);
			for(GraphWithWeight<Integer>.Edge edge: g.getAdjacent(vertexNo)){
				int adj=edge.end;
				int edgeWeight=edge.weight;
				
				 if(!minHeap.contains(adj)){
					 continue;
				 }
				 
				 int newDistance=weight+edgeWeight;
				 if(newDistance<minHeap.getWeight(adj)){
					 minHeap.decreaseKey(adj, newDistance);
				 }
				 
			}
		}
		return distance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphWithWeight<Integer> g=new GraphWithWeight<>();
		int start=1;
		int end=4;
		g.addEdge(1, 2, 2);
		g.addEdge(1, 4, 4);
		g.addEdge(2, 3, 1);
		g.addEdge(3, 4, 3);
		g.addEdge(4, 5, 1);
		
		MinCostPathExtraWeight obj=new MinCostPathExtraWeight();
		HashMap<Integer,Integer> distance=obj.dijkstrasAlgo(g, start);
		System.out.println(distance);
	}

}
