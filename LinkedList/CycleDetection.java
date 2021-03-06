package linkedListProblems;

import java.util.HashMap;

public class CycleDetection {
	
	public LinkedListNode<Character> cycleDetection(LinkedListNode<Character> root){
		HashMap<Character,LinkedListNode<Character>> hashMap=new HashMap<>();
		while(root!=null){
			if(hashMap.containsKey(root.data)){
				return hashMap.get(root.data);
			}else{
				hashMap.put(root.data, root);
			}
			root=root.next;
		}	
		return null;//no cycle detected
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode<Character> root=new LinkedListNode<>('A');
		root.next=new LinkedListNode<>('B');
		root.next.next=new LinkedListNode<>('C');
		root.next.next.next=new LinkedListNode<>('D');
		root.next.next.next.next=new LinkedListNode<>('E');
		root.next.next.next.next.next=new LinkedListNode<>('B');
		LinkedListNode<Character> cycleStartNode=new CycleDetection().cycleDetection(root);
		if(cycleStartNode==null){
			System.out.println("No cycle detected");
		}else{
			System.out.println("cycle detected and starts at Node with value "+cycleStartNode.data);
		}
		
		
	}

}
