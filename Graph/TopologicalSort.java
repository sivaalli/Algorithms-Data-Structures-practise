package graphs;
import java.util.*;

class myGraph<T>{
	private HashMap<T,Set<T>> hashGraph= new HashMap<>();
	public void addEdge(T start, T end){
		if(hashGraph.containsKey(start)){
			hashGraph.get(start).add(end);
		}else{
			Set<T> adj=new HashSet<>();
			adj.add(end);
			hashGraph.put(start, adj);
		}
	}
	public Set<T> keySet(){
		Set<T> keySet=hashGraph.keySet();
		return keySet;
	}
	public Set<T> getAdjacent(T start){
		return hashGraph.get(start);
	}
}
public class TopologicalSort {

	private void toplogicalSortUtil(myGraph<Character> g,char c,Stack<Character> sortedStack,Set<Character> visited ){
		visited.add(c);
		if(g.getAdjacent(c)!=null){
			for(char adj:g.getAdjacent(c)){
				if(!visited.contains(adj)){
					toplogicalSortUtil(g,adj,sortedStack,visited);
				}	
			}
		
	}
		sortedStack.add(c);
	}
	public void toplogicalSort(myGraph<Character> g){
		Set<Character> visited = new HashSet<>(); 
		Set<Character> keySet=g.keySet();
		Stack<Character> sortedStack=new Stack<>();
		for(char c:keySet){
			if(!visited.contains(c)){
				toplogicalSortUtil(g,c,sortedStack,visited);	
			}
			
		}
		while(!sortedStack.isEmpty()){
			System.out.println(sortedStack.pop());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myGraph<Character> g= new myGraph<>();
		g.addEdge('a', 'c');
		g.addEdge('d', 'a');
		g.addEdge('b', 'd');
		g.addEdge('b', 'a');
		TopologicalSort obj=new TopologicalSort();
		obj.toplogicalSort(g);
	}

}
