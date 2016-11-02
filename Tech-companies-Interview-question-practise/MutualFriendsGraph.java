package smapleQuestionsAlgorithms;

import java.util.*;

class Person{
	char name;
	int noOfmf;
	Person(char name,int noOfmf){
		this.name=name;
		this.noOfmf=noOfmf;
	}
}

public class MutualFriendsGraph {

	
	private static void MostMustualFriendUtil(Graph<Character> g,char start,HashMap<Character,Integer> count,int depth,Set<Character> visited){
		if(depth==2){
			if(count.containsKey(start)){
				count.put(start, count.get(start)+1);
			}else{
				count.put(start, 1);
			}
		}
		if(depth<2){
			visited.add(start);
			for(Character adj : g.getAdjacentList(start)){
				if(!visited.contains(adj)){
					MostMustualFriendUtil(g, adj, count, depth+1, visited);
				}
			}
			}
	}
	public static PriorityQueue<Person> MostMustualFriend(Graph<Character> g,char start){
		HashMap<Character,Integer> count=new HashMap<>();
		Set<Character> visited=new HashSet<>();
		MostMustualFriendUtil(g, start, count, 0, visited);
		PriorityQueue<Person> topFirends=new PriorityQueue<>(new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				if(o1.noOfmf<o2.noOfmf){
					return 1;
				}else if(o1.noOfmf>o2.noOfmf){
					return -1;
				}
				return 0;
			}
			
		});
		System.out.println(count);
		for(Map.Entry<Character, Integer> entry: count.entrySet()){
			char name=entry.getKey();
			int mutualFriends=entry.getValue();
			topFirends.offer(new Person(name,mutualFriends));
		}
		return topFirends;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph<Character> graph=new Graph<>();
		graph.addEdge('A', 'B');
		graph.addEdge('A', 'C');
		graph.addEdge('A', 'D');
		graph.addEdge('A', 'E');
		graph.addEdge('A', 'F');
		graph.addEdge('B', 'I');
		graph.addEdge('B', 'H');
		graph.addEdge('C', 'H');
		graph.addEdge('D', 'H');
		graph.addEdge('E', 'J');
		graph.addEdge('F', 'I');
		
		PriorityQueue<Person> topFirends=MostMustualFriend(graph, 'A');
		
		while(topFirends.size()>0){
			System.out.println(topFirends.poll().name);
		}
		
		
	}

}
