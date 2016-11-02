package linkedListProblems;

public class SwapKthNodes {
	
	public static LinkedListNode<Integer> swap(LinkedListNode head,int k){
		LinkedListNode current=head,swap1 = null,swap2 = null,prev1 = null,prev2 = null,parent,dummy;
		int len=0;
		int count=0;
		while(current!=null){
			len++;
			current=current.next;
		}
		if(k>len){
			return null;
		}
		else{
			current= head;
			parent=null;
			while(current!=null){
				count++;
				if(count==k){	
					prev1=parent;
					swap1=current;
				}
				else if(count==len-k+1){
					prev2=parent;
					swap2=current;
					break;
				}
				parent=current;
				current=current.next;
			}
			dummy=swap2.next;
			//swap2.next=null;
			prev1.next=swap2;
			swap2.next=swap1.next;
			prev2.next=swap1;
			swap1.next=dummy;
					/*int dummy=(int) swap1.data;
					swap1.data=swap2.data;
					swap2.data=dummy;*/
		}
		return head;
		
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
		head=swap(head,3);
		while(head!=null){
			System.out.print(head.data+"->");
			head=head.next;
		}
	}

}
