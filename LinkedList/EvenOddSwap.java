package linkedListProblems;

public class EvenOddSwap {
	
	public static LinkedListNode<Integer> swap(LinkedListNode<Integer> root){
		LinkedListNode<Integer> current=root;
		LinkedListNode<Integer> odd=null;
		LinkedListNode<Integer> even=null;
		while(current!=null){
			if(current.data%2==0){
				even=current;
			}else{
				odd=current;
			}
			if(odd!=null&&even!=null){
				int dummy;
				dummy=odd.data;
				odd.data=even.data;
				even.data=dummy;
				odd=null;
				even=null;
			}
			current=current.next;
		}
		
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode<Integer> root=new LinkedListNode<Integer>(7);
		root.next=new LinkedListNode<Integer>(4);
		root.next.next=new LinkedListNode<Integer>(6);
		root.next.next.next=new LinkedListNode<Integer>(2);
		root.next.next.next.next=new LinkedListNode<Integer>(9);
		root.next.next.next.next.next=new LinkedListNode<Integer>(8);
		root.next.next.next.next.next.next=new LinkedListNode<Integer>(11);
		while(swap(root)!=null){
			System.out.print(root.data+" ");
			root=root.next;
		}
		
	}

}
