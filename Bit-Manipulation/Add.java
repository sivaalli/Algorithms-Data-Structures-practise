package bitManipulations;

public class Add {
	public static boolean returnCarry(int a,int b,int i){
		if((a&(1<<i))!=0 && (b&(1<<i))!=0){
			return true;
		}
		return false;
	}
	public static int addNum(int a,int b,int i){
		if((a&(1<<i))!=0 && (b&(1<<i))!=0){
			return 0;
		}else if((a&(1<<i))!=0 || (b&(1<<i))!=0){
			return 1<<i;
		}else 
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=4;
		int number=0;
		boolean prevCarry=false;
		for(int i=0;i<32;i++){
			int n=addNum(a,b,i);
			System.out.print("n="+n);
			System.out.print("  "+(a&(1<<i))+"  ");
			System.out.print("  "+(b&(1<<i))+"  ");
			boolean carry=returnCarry(a,b,i);
			if(prevCarry){
				if(carry){
					n=(1<<i);
				}else{
					if(n!=0){carry=true;n=0;}
					else{n=1<<i;}
				}
				
			}
			System.out.print("prev carry="+prevCarry);
			System.out.print(" carry="+carry);
			System.out.print("  "+Integer.toBinaryString(n));
			prevCarry=carry;
			number=number|n;
			System.out.println();
		}

		System.out.println(number);
			
	
	}
}
