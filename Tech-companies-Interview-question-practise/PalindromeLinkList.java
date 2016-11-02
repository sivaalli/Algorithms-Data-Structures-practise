package smapleQuestionsAlgorithms;


class Stack{
	Object[] arr;
	int counter=0;
	int size;
	Stack(int n){
		arr=new Object[n];
		size=n;
	}
	public void push(Object obj){
		if(counter==size){
			System.out.println("stack full");
		}
		else{
			arr[counter]=obj;
			counter++;
		}
	}
	public Object pop(){
		if(counter==0){
			System.out.println("stack empty cannot pop");
			return null;
		}else{
			counter--;
			return arr[counter];
		}
	}
}

public class PalindromeLinkList {
	//used from IntersectionLinkList.java
	public static LinkList head;
	public static void insert(int data){
		LinkList list=new LinkList(data);
		LinkList iterator=head;
		if(head==null){
			head=list;
			head.next=null;
		}
		else{
			while(iterator.next!=null){
				iterator=iterator.next;
			}
			iterator.next=list;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		insert(1);
		insert(2);
		insert(3);
		insert(2);
		insert(1);
		int count=0;
		LinkList localHead=head;
		while(localHead!=null){
			localHead=localHead.next;
			count++;
		}
		Stack s= new Stack(count);
		localHead=head;
		for(int i=0;i<count;i++){
			s.push(localHead);
			localHead=localHead.next;
			System.out.println("pushed");
		}
		
		localHead=head;
		for(int i=0;i<count;i++){
			LinkList sample=(LinkList)s.pop();
			if(sample.data==localHead.data){
				
			}else{
				System.out.println("not a palindrome");
				return;
			}
			localHead=localHead.next;
		}
		System.out.println("is a palindrome");
	}

}
