package smapleQuestionsAlgorithms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LRUCache {
	int capacity;
	Queue<Integer> q;
	Map <Integer,Integer> hashMap;
	LRUCache(int capacity){
		this.capacity=capacity;
		q=new LinkedList<>();
		hashMap=new HashMap<>();
	}
	
	public int get(int key){
		if(hashMap.containsKey(key)){
			return hashMap.get(key);
		}
		return 0;
		
	}
	public void set(int key,int value){
		if(!hashMap.isEmpty() && hashMap.containsKey(key)){
			q.remove(key);
			q.add(key);
		}else{
			if(q.size()>=capacity){
				System.out.println("Removed "+q.remove());
				q.add(key);
				hashMap.put(key, value);
			}else{
				q.add(key);
				hashMap.put(key, value);
			}
			
		}
		System.out.println("Added "+key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache cache=new LRUCache(3);
		cache.set(1,23324);
		cache.set(2,2324);
		cache.set(3,53324);
		cache.set(2,23324);
		cache.set(4,29324);
		cache.set(5,2424);
		cache.set(6,23);
		
	}

}
