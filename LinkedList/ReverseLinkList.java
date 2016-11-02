package linkedListProblems;

public class ReverseLinkList {
	
	public static LinkedListNode reverse(LinkedListNode head){
		LinkedListNode previous=null;
		while(head!=null){
			LinkedListNode dummy=head.next;
			head.next=previous;
			previous= head;
			head=dummy;
		}
		return previous;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode<Integer> head=new LinkedListNode<>(1);
		head.next=new LinkedListNode<>(2);
		head.next.next=new LinkedListNode<>(3);
		head.next.next.next=new LinkedListNode<>(4);
		head.next.next.next.next=new LinkedListNode<>(5);
		head.next.next.next.next.next=new LinkedListNode<>(6);
		head.next.next.next.next.next.next=new LinkedListNode<>(7);
		head.next.next.next.next.next.next.next=new LinkedListNode<>(8);
		LinkedListNode current=head;
		while(head!=null){
			System.out.print(head.data+"->");
			head=head.next;
		}
		System.out.println();
		LinkedListNode newHead=reverse(current);
		while(newHead!=null){
			System.out.print(newHead.data+"->");
			newHead=newHead.next;
		}
	}

}
