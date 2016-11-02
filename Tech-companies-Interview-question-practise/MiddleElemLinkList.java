package smapleQuestionsAlgorithms;


class List{
	int data;
	List next;
	List(int data){
		this.data=data;
	}
}
public class MiddleElemLinkList{
	
	public static List head;
	public void addElement(int data){
		if(head==null){
			head=new List(data);
			head.next=null;
			
		}
		else{
			List element=new List(data);
			element.next=null;
			List lastElement=head;
			while(lastElement.next!=null){
				lastElement=lastElement.next;
			}
			lastElement.next=element;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		MiddleElemLinkList linkList=new MiddleElemLinkList();
		linkList.addElement(1);
		linkList.addElement(2);
		linkList.addElement(4);
		linkList.addElement(4);
		linkList.addElement(5);
		linkList.addElement(6);
		List element=head;
		while(element!=null){
			count=count+1;
			element=element.next;
		}
		int middle=1+ count/2;
	
		count=0;
		element=head;
		while(true){
			count=count+1;		
			if(count==middle){
				System.out.println(element.data);
				break;
			}
			element=element.next;
		}
		
		
	}


}
