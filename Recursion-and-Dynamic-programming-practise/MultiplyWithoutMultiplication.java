package recurssion_dynamicProgramming;

public class MultiplyWithoutMultiplication {

	public int multiply(int a, int b, int i){
		if(i==a||i==b){
			return 0;
		}
		int sum=(a>b)? a:b;
		sum = sum+multiply(a,b,i+1);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new MultiplyWithoutMultiplication().multiply(2,3, 0));
	}

}
