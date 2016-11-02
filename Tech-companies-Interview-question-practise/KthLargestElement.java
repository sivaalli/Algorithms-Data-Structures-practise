package smapleQuestionsAlgorithms;

import java.util.Collections;
import java.util.PriorityQueue;

//stream of numbers. remove 
public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stream={1,2,3,4,5,6,6,7,8,9};
		int k=3;
		PriorityQueue<Integer> pq=new PriorityQueue<>(k);
		//insert k elements in priority queue
		for(int i=0;i<k;i++){
			pq.offer(stream[i]);
		}
		
		
	}

}
