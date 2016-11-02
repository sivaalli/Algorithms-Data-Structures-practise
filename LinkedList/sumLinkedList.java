package linkedListProblems;
public class sumLinkedList {
	
	public LinkedListNode<Integer> returnNode(LinkedListNode<Integer> root1,LinkedListNode<Integer> root2){
		if(root1==null||root2==null){
			return null;
		}
		int carry=0;
		int sum=0;
		LinkedListNode<Integer> root3=null;
		LinkedListNode<Integer> current = null;
		while(root1!=null&&root2!=null){
			sum=root1.data+root2.data;
			if(carry!=0){
				sum=sum+carry;
			}
			if(sum>=10){
				carry=sum/10;
				sum=sum%10;
			}else{
				carry=0;
			}
			//System.out.println(sum);
			if(root3==null){
				root3=new LinkedListNode<>(sum);
				current=root3;
		
			}else{
				current.next=new LinkedListNode<>(sum);
				current=current.next;
			}
			root2=root2.next;
			root1=root1.next;
		}
		if(carry!=0){
			current.next=new LinkedListNode<>(carry);
		}
		return root3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode<Integer> root1=new LinkedListNode<>(7);
		root1.next=new LinkedListNode<>(1);
		root1.next.next=new LinkedListNode<>(6);
		LinkedListNode<Integer> root2=new LinkedListNode<>(5);
		root2.next=new LinkedListNode<>(9);
		root2.next.next=new LinkedListNode<>(3);
		LinkedListNode<Integer> root3=new sumLinkedList().returnNode(root1, root2);
		
		while(root3!=null){
			System.out.print(root3.data);
			root3=root3.next;
		}
	}

}
