package smapleQuestionsAlgorithms;
/*Given two lists sorted in increasing order, create a new list representing the intersection of the two lists. The new list should be made with its own memory — the original lists should not be changed.

For example, let the first linked list be 1->2->3->4->6 and second linked list be 2->4->6->8, then your function should create a third list as 2->4->6.*/

class LinkList{
	int data;
	LinkList next=null;
	LinkList(int data){
		this.data=data;
	}
	
}

public class IntersectionLinkList {
	public static LinkList head3;
	public static LinkList head1;
	public static LinkList head2;
	public void insert1(int data){
		LinkList list=new LinkList(data);
		LinkList iterator=head1;
		if(head1==null){
			head1=list;
			head1.next=null;
		}
		else{
			while(iterator.next!=null){
				iterator=iterator.next;
			}
			iterator.next=list;
		}
	}
	public void insert2(int data){
		LinkList list=new LinkList(data);
		LinkList iterator=head2;
		if(head2==null){
			head2=list;
			head2.next=null;
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
		IntersectionLinkList obj1=new IntersectionLinkList();
		obj1.insert1(1);
		obj1.insert1(2);
		obj1.insert1(3);
		obj1.insert1(4);
		obj1.insert1(6);
		obj1.insert2(2);
		obj1.insert2(4);
		obj1.insert2(6);
		obj1.insert2(8);
		LinkList iterator1=head1;
		LinkList iterator2=head2;
		/*while(iterator2!=null){
			System.out.println(iterator2.data);
			iterator2=iterator2.next;
		}*/
		LinkList ahead=null;
		while(iterator1!=null){
			iterator2=head2;
			while(iterator2!=null){	
				System.out.println("data1="+iterator1.data+"----data2="+iterator2.data);
				if(iterator1.data==iterator2.data){
					System.out.println("found data");
					LinkList list=new LinkList(iterator1.data);
					if(head3==null){
						head3=list;
						head3.next=null;	
						ahead=head3;
						System.out.println("created head");
					}
					else{
						ahead.next=list;
						ahead=ahead.next;
						System.out.println("cretead link");
					}
					
				}
				iterator2=iterator2.next;
			}
			iterator1=iterator1.next;
		}
		
		LinkList iterator3=head3;
		while(iterator3!=null){
			System.out.println(iterator3.data);
			iterator3=iterator3.next;
		}
	
	}

}
