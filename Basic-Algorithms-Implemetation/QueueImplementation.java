package algorithms;

public class QueueImplementation {
	public static int[] arr=new int[10];
	public static int head=0,tail=0;
	public static void enQueue(int data){
		if(tail<arr.length){
			arr[tail]=data;
			System.out.println("inserted "+arr[tail]);
			tail++;
		}
		else
			System.out.println("queue full");
	}
	public static void deQueue(){
		if(tail>=head){
			System.out.println("dequeued "+arr[head]);
			arr[head]=0;
			head++;
		}
		else
			System.out.println("no elements to dequeu");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enQueue(1);
		enQueue(2);
		enQueue(3);
		enQueue(4);
		enQueue(5);
		enQueue(6);
		enQueue(7);
		enQueue(8);
		enQueue(9);
		enQueue(10);
		deQueue();
		enQueue(11);
		
	}

}
