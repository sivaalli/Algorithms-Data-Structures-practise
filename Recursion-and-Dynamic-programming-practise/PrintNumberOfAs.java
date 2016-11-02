package recurssion_dynamicProgramming;

public class PrintNumberOfAs {
	
	public static int max(int a, int b, int c){
		if(a>b && a>c){
			return a;
		}
		else if(b>a&&b>c){
			return b;
		}
		else
			return c;
	}
	public int printAs(int n,int noOfAsCurrent){
		if(n==0){
			return noOfAsCurrent;
		}
		if(n<0){
			return Integer.MIN_VALUE;
		}
		return max(printAs(n-1,noOfAsCurrent+1),printAs(n-3,noOfAsCurrent*2),printAs(n-1,noOfAsCurrent*2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumberOfAs print=new PrintNumberOfAs();
		System.out.println(print.printAs(7, 0));
	}

}
