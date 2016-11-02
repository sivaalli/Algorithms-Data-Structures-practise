package algorithms;

public class StackImplementation {
	
	static int[] stack=new int[6];
	static int counter=-1;
	
	public static void push(int num){
		if(counter==stack.length){
			System.out.println("stack full please pop before pushing element");
		}else 
			counter++;
			stack[counter]=num;
			
		
	}
	public static void pop(){
		if(counter==-1){
			System.out.println("stack empty");
		}else
			System.out.println(stack[counter]);
			stack[counter]=0;
			counter--;
		
		
	}

	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		push(6);
		pop();
	for(int i=0;i<stack.length;i++){
	System.out.println(stack[i]);	
	
	}

}
}
